package com.zed.base_demo.shiro;import com.zed.base_demo.entity.Permission;import com.zed.base_demo.entity.Role;import com.zed.base_demo.entity.User;import com.zed.base_demo.service.UserService;import lombok.extern.slf4j.Slf4j;import org.apache.shiro.authc.AccountException;import org.apache.shiro.authc.AuthenticationException;import org.apache.shiro.authc.AuthenticationInfo;import org.apache.shiro.authc.AuthenticationToken;import org.apache.shiro.authc.LockedAccountException;import org.apache.shiro.authc.SimpleAuthenticationInfo;import org.apache.shiro.authc.UsernamePasswordToken;import org.apache.shiro.authz.AuthorizationInfo;import org.apache.shiro.authz.SimpleAuthorizationInfo;import org.apache.shiro.realm.AuthorizingRealm;import org.apache.shiro.subject.PrincipalCollection;import org.apache.shiro.util.CollectionUtils;import org.springframework.beans.factory.annotation.Autowired;import java.util.ArrayList;import java.util.List;import java.util.Set;/** * @author:Zed * @date: 2019/5/2 */@Slf4jpublic class AuthRealm extends AuthorizingRealm {    @Autowired    private UserService userService;    /**     * 认证     */    @Override    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {//        User primaryPrincipal = (User) principals.getPrimaryPrincipal();//        if (null == primaryPrincipal) {//            log.error("授权失败，用户信息为空！！！");//            return null;//        }        //获取登录用户        User user = (User) principals.fromRealm(this.getClass().getName()).iterator().next();        if (null == user) {            log.error("授权失败，用户信息为空！！！");            return null;        }        //获取角色和权限        List<String> permissionList = new ArrayList<String>();        List<String> roleNameList = new ArrayList<String>();        Set<Role> roleSet = user.getRoles();        if (!CollectionUtils.isEmpty(roleSet)) {            for (Role role : roleSet) {                roleNameList.add(role.getRname());                Set<Permission> permissionSet = role.getPermissions();                if (!CollectionUtils.isEmpty(permissionSet)) {                    for (Permission permission : permissionSet) {                        permissionList.add(permission.getName());                    }                }            }        }        //设置角色和权限        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();        info.addStringPermissions(permissionList);        info.addRoles(roleNameList);        return info;    }    /**     * 授权登陆     */    @Override    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {        log.info("————身份认证方法————");        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;        String username = usernamePasswordToken.getUsername();        User user = userService.findByUsername(username);        if (user == null) {            log.info("账号：{} 不存在！", username);            throw new AccountException("账号或者密码错误");        }        //账户冻结        if (user.getState() == 0) {            log.warn("账号：{} 已被冻结！", user.getUsername());            throw new LockedAccountException(String.format("账号【%s】已冻结！", username));        }        return new SimpleAuthenticationInfo(user, user.getPassword(), this.getClass().getName());    }}
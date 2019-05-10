package com.zed.base_demo.entity;

import com.zed.base_demo.base.BaseEntity;

import java.util.HashSet;
import java.util.Set;

public class Role extends BaseEntity {
    /**
     * 角色ID
     */
    private Integer rid;

    /**
     * 角色名
     */
    private String rname;
    private Set<Permission> permissions = new HashSet<Permission>();
    private Set<User> users = new HashSet<User>();
    /**
     * 角色ID
     * @return rid 角色ID
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 角色ID
     * @param rid 角色ID
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * 角色名
     * @return rname 角色名
     */
    public String getRname() {
        return rname;
    }

    /**
     * 角色名
     * @param rname 角色名
     */
    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
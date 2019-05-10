package com.zed.base_demo.entity;

import com.zed.base_demo.base.BaseEntity;

public class RolePermission extends BaseEntity {
    /**
     * 角色ID
     */
    private Integer rid;

    /**
     * 权限名
     */
    private Integer pid;

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
     * 权限名
     * @return pid 权限名
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 权限名
     * @param pid 权限名
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
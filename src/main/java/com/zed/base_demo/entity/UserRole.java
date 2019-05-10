package com.zed.base_demo.entity;

import com.zed.base_demo.base.BaseEntity;

public class UserRole extends BaseEntity {
    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 角色ID
     */
    private Integer rid;

    /**
     * 用户ID
     * @return uid 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 用户ID
     * @param uid 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

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
}
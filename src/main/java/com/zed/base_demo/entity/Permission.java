package com.zed.base_demo.entity;

import com.zed.base_demo.base.BaseEntity;

public class Permission extends BaseEntity {
    /**
     * 权限ID
     */
    private Integer pid;

    /**
     * 权限名
     */
    private String name;

    /**
     * 权限url
     */
    private String url;

    /**
     * 权限ID
     * @return pid 权限ID
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 权限ID
     * @param pid 权限ID
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 权限名
     * @return name 权限名
     */
    public String getName() {
        return name;
    }

    /**
     * 权限名
     * @param name 权限名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 权限url
     * @return url 权限url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 权限url
     * @param url 权限url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}
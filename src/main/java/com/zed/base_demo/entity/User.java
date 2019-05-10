package com.zed.base_demo.entity;

import com.zed.base_demo.base.BaseEntity;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
@Data
public class User extends BaseEntity {
    /**
     * 用户ID
     */
    private String uid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态(1启用 0禁用)
     */
    private Integer state;

    /**
     * 用户角色
     */
    private Set<Role> roles = new HashSet<Role>();

}
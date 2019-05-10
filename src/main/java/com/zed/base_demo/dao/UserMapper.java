package com.zed.base_demo.dao;

import com.zed.base_demo.entity.User;
import com.zed.base_demo.entity.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
    /**
     * 通过用户名获取用户信息
     * @param username 用户名
     * @return
     */
    User findByUsername(@Param("username") String username);
}
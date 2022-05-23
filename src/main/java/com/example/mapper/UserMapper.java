package com.example.mapper;

import com.example.entity.User;

import java.util.List;

/**
* @author lmy
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-05-23 22:06:28
* @Entity com.example.entity.User
*/
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUsernameAndPassword(String username, String password);
}




package com.example.controller;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author lmy
 * @Date 2022/5/23 22:17
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping
    public List<User> findAll(){
        return userMapper.selectAll();
    }

}

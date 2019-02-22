package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    public User getUserById(String userId) {
        return userMapper.findByName(userId);
    }

    public int insert(String name,Integer age){
        return userMapper.insert(name,age);
    }

}
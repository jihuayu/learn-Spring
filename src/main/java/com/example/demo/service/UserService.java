package com.example.demo.service;

import com.example.demo.user.User;

public interface UserService {
    User getUserById(String userId);
    int insert(String name,Integer age);

}

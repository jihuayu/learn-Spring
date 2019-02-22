package com.example.demo.service;

import com.example.demo.user.User;

/**
 * Created by zl on 2015/8/27.
 */

public interface UserService {
    User getUserById(String userId);
    int insert(String name,Integer age);

}

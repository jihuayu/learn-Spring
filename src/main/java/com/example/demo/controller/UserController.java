package com.example.demo.controller;


import com.example.demo.service.UserService;
import com.example.demo.user.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
    @Resource(name="userService")
    private UserService userService;

    @RequestMapping(value="/{name}" ,method= RequestMethod.GET)
    public User toIndex(@PathVariable String name){
        System.out.println(name);
        System.out.println(11111);
        User user = this.userService.getUserById(name);
        return user;
    }
    @RequestMapping(value="/" ,method= RequestMethod.POST)
    public String to1Index(HttpServletRequest request){
        int age = Integer.parseInt(request.getParameter("age"));
        String name = request.getParameter("name");
        if(name!=null&&age!=0){
            this.userService.insert(name,age);
            return  "ok";
        }
        return  "bad";
    }
}

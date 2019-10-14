package com.lnb.user.controller;

import com.lnb.user.bean.User;
import com.lnb.user.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/test")
    public List<User> getAllUser(){
        List<User> userList = userService.getAllUser();
        userList.forEach(user -> {
            log.info("user={}", user);
        });
        return userList;
    }

    @GetMapping("/test/{id}")
    public User getAllUser(@PathVariable Long id){
        User user = userService.getById(id);
        log.info("user={}", user);
        return user;
    }
}

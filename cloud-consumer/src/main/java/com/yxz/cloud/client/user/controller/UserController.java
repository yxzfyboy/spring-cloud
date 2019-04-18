package com.yxz.cloud.client.user.controller;

import com.yxz.cloud.client.user.entity.User;
import com.yxz.cloud.client.user.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRemote userRemote;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userRemote.findById(id);
        return user;
    }

}

package com.bulgae.api.controllers;

import com.bulgae.api.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

@RestController
public class UserController {

    @RequestMapping("/user")
    public User index(@RequestParam(value = "id", defaultValue = "unknown") String id) {
        return new User("Frank", "ocean", id);
    }
}
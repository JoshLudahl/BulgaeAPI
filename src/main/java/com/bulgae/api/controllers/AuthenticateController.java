package com.bulgae.api.controllers;

import com.bulgae.api.models.users.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {

    @RequestMapping("/login")
    public User login() {
        return new User("fname", "lname");
    }

    @RequestMapping("/logout")
    public int logout() {
        return 200;
    }
}

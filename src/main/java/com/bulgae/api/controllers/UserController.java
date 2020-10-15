package com.bulgae.api.controllers;

import com.bulgae.api.models.users.Broker;
import com.bulgae.api.models.users.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")
    public User index() {
        return new Broker("Frank", "Ocean");
    }
}

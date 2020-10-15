package com.bulgae.api.controllers;

import com.bulgae.api.models.users.Broker;
import com.bulgae.api.models.users.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")
    public User index(@RequestParam(value = "id", defaultValue = "404") String id) {
        if (id.equals("404")) {
            return new User ("unknown", "unknown", "404");
        }
        return new Broker("Frank", "Ocean", id);
    }
}

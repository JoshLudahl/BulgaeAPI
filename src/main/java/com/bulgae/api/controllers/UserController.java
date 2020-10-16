package com.bulgae.api.controllers;

import com.bulgae.api.models.repositories.user.UserRepository;
import com.bulgae.api.models.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class UserController {

    @Autowired
    UserRepository repo;

    @RequestMapping("/users")
    public ArrayList<User> index() {
        ArrayList<User> users = new ArrayList<>();
        for (User user: repo.findAll()) {
            users.add(user);
        }
        return users;
    }

    @RequestMapping("/user")
    public User user() {
        return new User("Tedward", "Spud");
    }
}



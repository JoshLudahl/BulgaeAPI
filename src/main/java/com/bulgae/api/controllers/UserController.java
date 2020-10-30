package com.bulgae.api.controllers;

import com.bulgae.api.models.repositories.users.UserRepository;
import com.bulgae.api.models.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;


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
    public Optional<User> user(
            @RequestParam String id
    ) {
        Optional<User> user = repo.findById(id);
        return user;
    }

    @RequestMapping("/user/add")
    public User addUser(
            @RequestParam(name = "email") String email,
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName
    ) {
        User user = new User(firstName, lastName, email);
        repo.save(user);
        return user;
    }

    @RequestMapping("/user/update")
    public Optional<User> update(
            @RequestParam User userToUpdate
    ) {
        Optional<User> user = repo.findById(userToUpdate.getId());
        // perform update on user object
        return user;
    }

    @RequestMapping("/user/remove")
    public Optional<User> removeUser(
            @RequestParam String id
    ) {
        Optional<User> user = repo.findById(id);
        repo.deleteById(id);
        return user;
    }
}

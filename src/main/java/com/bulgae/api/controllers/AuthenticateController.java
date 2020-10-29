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
public class AuthenticateController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/login")
    public User login() {
        return new User("fname", "lname", "email");
    }

    @RequestMapping("/logout")
    public int logout() {
        return 200;
    }

    @RequestMapping("/signup")
    public Optional<User> signup(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String email
    ) {
        User user = new User(firstName, lastName, email);
        ArrayList<User> userFound;
        userFound = userRepository.findByEmail(email);
        if (userFound.size() == 0) {
            userRepository.save(user);
            return Optional.of(user);
        } else {
            // TODO: 10/28/20 Return something more useful
            return null;
        }
    }
}

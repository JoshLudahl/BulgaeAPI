package com.bulgae.api.controllers;

import com.bulgae.api.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "Generic greeting message";
    }

    @RequestMapping("/status")
    public int status() {
        return 200;
    }
}

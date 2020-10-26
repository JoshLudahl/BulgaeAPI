package com.bulgae.api.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest(WelcomeController.class)
class WelcomeControllerTest {

@Autowired
    private MockMvc mockMvc;

    @Test
    void status() throws Exception {
        mockMvc.perform(get("/status"));
    }
}
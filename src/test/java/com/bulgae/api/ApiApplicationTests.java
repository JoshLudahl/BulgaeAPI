package com.bulgae.api;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApiApplicationTests {

    @Test
    void contextLoads() {


        String expectedMessage = "For input string";
        String actualMessage = "exception.getMessage();";

        assertTrue(actualMessage.contains(expectedMessage));
    }

}

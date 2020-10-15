package com.bulgae.api;

import com.bulgae.api.models.repositories.user.UserRepository;
import com.bulgae.api.models.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new User("email@domain.com"));


        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (User user : repository.findAll()) {
            System.out.println(user);
        }


    }
}

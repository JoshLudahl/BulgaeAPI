package com.bulgae.api.models.users;

import org.springframework.data.annotation.Id;

public class User {
    private String firstName;
    private String lastName;
    @Id private String id;
    private String phone;
    private String extension;
    private String email;
    private Role role;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

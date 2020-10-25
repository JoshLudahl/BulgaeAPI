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

    public User() {}
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public User(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                '}';
    }
}

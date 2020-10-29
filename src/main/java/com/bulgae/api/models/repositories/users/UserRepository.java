package com.bulgae.api.models.repositories.users;

import com.bulgae.api.models.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;

@RepositoryRestResource
public interface UserRepository extends MongoRepository<User, String> {
    ArrayList<User> findByEmail(String email);
}

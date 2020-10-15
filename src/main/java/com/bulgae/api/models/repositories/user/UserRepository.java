package com.bulgae.api.models.repositories.user;

import com.bulgae.api.models.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "user", path = "people")
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByEmail(String email);
}

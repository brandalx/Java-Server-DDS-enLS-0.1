package com.example.server.repositories;

import com.example.server.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // Additional custom methods, if needed
}
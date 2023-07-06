package com.example.server.services;

import com.example.server.models.User;
import com.example.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        // Logic to get all users
    }

    public User getUserById(Long id) {
        // Logic to get a user by ID
    }

    public User createUser(User user) {
        // Logic to create a new user
    }

    public User updateUser(Long id, User user) {
        // Logic to update a user
    }

    public void deleteUser(Long id) {
        // Logic to delete a user
    }
}

package com.example.server.controllers;
import com.example.server.models.User;
import com.example.server.services.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping
    public List<User> getAllUsers(){
        //todo: add logic to get all users
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        //todo:  Logic to get a user by ID
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        //todo:  Logic to create a new user
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        //todo:  Logic to update a user
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        //todo:  Logic to delete a user
    }
}
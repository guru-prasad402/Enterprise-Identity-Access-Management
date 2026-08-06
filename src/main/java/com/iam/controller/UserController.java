package com.iam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.iam.entity.User;
import com.iam.service.UserService;

 @RestController
  @RequestMapping("/users")
public class UserController {

     @Autowired
    private UserService userService;

   
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

   
     @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

   
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

        
   
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
    
    
}
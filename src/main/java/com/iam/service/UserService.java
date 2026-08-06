package com.iam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iam.entity.User;
import com.iam.repository.UserRepository;

@Service
 public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
     }

    public List<User> getAllUsers() {
        return userRepository.findAll();
   }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
      }
    
    
}
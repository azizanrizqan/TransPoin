package com.TransPoin.TransPoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.TransPoin.TransPoin.entity.User;
import com.TransPoin.TransPoin.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // GET ALL
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    // POST
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }
}
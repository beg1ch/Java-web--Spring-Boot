package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/additional-info")
    public List<User> getAdditionalInfo(@RequestParam String country) {
        Country countryEnum = Country.valueOf(country.toUpperCase());
        return userService.getUsersNotFromCountry(countryEnum);
    }
}
package com.jaasim.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/{userId}")
    public User getById(@PathVariable String userId) {
        // In a real app you'd look up the userId. Returning a sample user.
        return new User(userId, "Jaasim", "Ahamad", "jaasim.ahamad@example.com");
    }
}

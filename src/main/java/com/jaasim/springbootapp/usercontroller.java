package com.jaasim.springbootapp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/users")
public class usercontroller {
    @GetMapping("/{userId}")
    public User getbyId(@PathVariable String userId) {
        return new User("1", "Jaasim", "ahamad", "jaasim.ahamad@example.com");
    }

    @GetMapping("")
    public List<User> getUsers(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        return List.of(
            new User("1", "Jaasim", "ahamad", "jaasim.ahamad@example.com")
        );
    }
}


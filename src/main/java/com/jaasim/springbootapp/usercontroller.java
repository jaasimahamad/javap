package com.jaasim.springbootapp;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @PostMapping("")
    public User createUser(@RequestBody User user) {
        if (user.getId() == null) {
            user.setId("1");
        }
        return user;
    }

    @PutMapping("{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody User entity) {
        if (entity.getId() == null) {
            entity.setId(userId);
        }
        return entity;
    }

    @DeleteMapping("{userId}")
    public String deleteUser(@PathVariable String userId) {
        // In this sample controller we don't persist; return success message.
        return "User deleted successfully";
    }

    @GetMapping("")
    public List<User> getUsers(@RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return List.of(new User("1", "Jaasim", "Ahamad", "jaasim.ahamad@example.com"));
    }

    @GetMapping("{userId}")
    public User getById(@PathVariable String userId) {
        return new User(userId, "Jaasim", "Ahamad", "jaasim.ahamad@example.com");
    }
}

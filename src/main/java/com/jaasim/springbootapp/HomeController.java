package com.jaasim.springbootapp;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("")
    public String get() {
        return "Hello World";
    }
    @PostMapping("create")
    public String postMethodName(@RequestBody String payload) {
        return payload+ "Successfully created";
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable String id) {
        return "deleted "+id;
    }
    @GetMapping("get/{id}")
    public String getById(@PathVariable String id) {
        return "get "+id;
    }
}
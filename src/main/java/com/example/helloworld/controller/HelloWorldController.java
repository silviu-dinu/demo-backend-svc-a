package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        if (name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Name cannot have numbers");
        }

        return "Hello, " + name;
    }

    @GetMapping("/health/ready")
    public void health() {
        return;
    }

    @GetMapping("/version")
    public String version() {
        return getClass().getPackage().getImplementationVersion();
    }

}

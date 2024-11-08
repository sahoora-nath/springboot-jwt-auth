package com.mttech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    //access by the user and admin
    @GetMapping("/public/hello")
    public String hello() {
        return "Hello";
    }

    //access by the admin
    @GetMapping("/private/hello")
    public String helloPrivate() {
        return "Hello Private";
    }
}
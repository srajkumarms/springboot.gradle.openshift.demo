package com.openshift.demo.controllers;

import com.openshift.demo.models.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
public class UserController {

    @GetMapping()
    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("testuser"));
        users.add(new User("admin"));
        users.add(new User("superadmin"));
        return users;
    }
}

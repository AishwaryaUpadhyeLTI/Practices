package com.springproject.productmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.productmanagement.model.User;
import com.springproject.productmanagement.service.UserService;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserService userService;
 
    @PostMapping
    public ResponseEntity<User> addProduct(@RequestBody User user){
        return ResponseEntity.ok(userService.addProduct (user));
    }
}


    
    


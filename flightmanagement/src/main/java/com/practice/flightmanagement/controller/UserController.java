package com.practice.flightmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.flightmanagement.model.Flight;
import com.practice.flightmanagement.model.User;
import com.practice.flightmanagement.service.FlightServices;
import com.practice.flightmanagement.service.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices userServices;
 
    @Autowired
    private FlightServices flightServices;
 
    @GetMapping("/{printData}")
    public ResponseEntity<Flight> printData(@PathVariable String printData){
 
        return new ResponseEntity<>(userServices.printData(printData),HttpStatus.OK);
    }
 
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        userServices.addUser(user);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
 
 


    
}

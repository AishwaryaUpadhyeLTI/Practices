package com.practice.flightmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.flightmanagement.model.Flight;
import com.practice.flightmanagement.service.FlightServices;

@RestController
@RequestMapping("/flight")
public class FlightController {
    
@Autowired
    private FlightServices flightServices;

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights(){
        flightServices.addFlights();
        return new ResponseEntity<>(flightServices.getAllFlights(),HttpStatus.OK);
    }
 

    @PostMapping
    public ResponseEntity<Flight> addNewFlights(@RequestBody Flight flightAddNew){
        flightServices.addNewFlights(flightAddNew);
        return new ResponseEntity<>(flightAddNew,HttpStatus.OK);
    }
 
 
    
}
    


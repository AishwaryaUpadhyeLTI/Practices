package com.practice.flightmanagement.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.flightmanagement.model.Flight;
import com.practice.flightmanagement.model.User;

@Service
public class UserServices {
    List<User> userDetails = new ArrayList<>();
    HashMap<String,Flight> mapDeatils = new HashMap<>();
 
 
    @Autowired
    private FlightServices flightServices_2;
 
    public List<User> getAllUser(){
        return userDetails;
    }
 
 
    public Flight printData(String name){
        return mapDeatils.get(name);
    }
 
    public void addUser(User user){
        userDetails.add(user);
        List<Flight> flightDetails = flightServices_2.getAllFlights();
        for(Flight flight:flightDetails){
            if(user.getAssignedFlight().equals(flight.getFlightName()) && flight.isBooked()==false){
                flight.setBooked(true);
                mapDeatils.put(user.getUserName(),flight);
            }
        }
    }
 
    
}

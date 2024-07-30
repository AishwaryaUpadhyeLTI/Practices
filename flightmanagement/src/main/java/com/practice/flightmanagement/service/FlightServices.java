package com.practice.flightmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.flightmanagement.model.Flight;

@Service
public class FlightServices {
    List<Flight> flightDetails = new ArrayList<>();
 
    public void addFlights(){
        Flight flight_1 = new Flight();
        Flight flight_2 = new Flight();
        Flight flight_3 = new Flight();

        flight_1.setFlightName("Indigo");
        flight_1.setArrivalCities("Nagpur");
        flight_1.setDepatureCities("Mumbai");
        flight_1.setDepatureTime("8:00");
 
 
        flight_2.setFlightName("Vistara");
        flight_2.setArrivalCities("Dubai");
        flight_2.setDepatureCities("Delhi");
        flight_2.setDepatureTime("18:00");
 
 
        flight_3.setFlightName("Emirates");
        flight_3.setArrivalCities("Dubai");
        flight_3.setDepatureCities("Chennai");
        flight_3.setDepatureTime("15:00");
 
        flightDetails.add(flight_1);
        flightDetails.add(flight_2);
        flightDetails.add(flight_3);
    }
 
    public List<Flight> getAllFlights(){
        return flightDetails;
    }
 
    public Flight getFlightByName(String flightName){
        return flightDetails.stream().filter(f->f.getFlightName().equals(flightName)).findFirst().orElse(null);
    }
 
    public void addNewFlights(Flight flight){
        flightDetails.add(flight);
    }
}
    


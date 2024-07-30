package com.practice.flightmanagement.model;

public class Flight {
    private String flightName;
    private String arrivalCities;
    private String depatureCities;
    private String depatureTime;
    private boolean isBooked;
    public Flight(){
        this.isBooked = false;
    }

    public String getFlightName() {
        return flightName;
    }
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    public String getArrivalCities() {
        return arrivalCities;
    }
    public void setArrivalCities(String arrivalCities) {
        this.arrivalCities = arrivalCities;
    }
    public String getDepatureCities() {
        return depatureCities;
    }
    public void setDepatureCities(String depatureCities) {
        this.depatureCities = depatureCities;
    }
    public String getDepatureTime() {
        return depatureTime;
    }
    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }
 
 
 
    public boolean isBooked() {
        return isBooked;
    }
 
 
 
    public void setBooked(boolean isBooked) {
        this.isBooked = true;
    }
 
    
 
 
}
    


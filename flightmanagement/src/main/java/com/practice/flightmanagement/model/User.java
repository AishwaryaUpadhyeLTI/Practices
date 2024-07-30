package com.practice.flightmanagement.model;

public class User {

    private int userID;
    private String userName;
    private String assignedFlight;
    public String getAssignedFlight() {
        return assignedFlight;
    }
    public void setAssignedFlight(String assignedFlight) {
        this.assignedFlight = assignedFlight;
    }
    public User(){
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    
 
}
    
    


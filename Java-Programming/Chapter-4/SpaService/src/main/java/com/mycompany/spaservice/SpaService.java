package com.mycompany.spaservice;

public class SpaService {
    
    // Declare variables for spa to use
    private String serviceDescription;
    private double price;
    
    // Declare setter (mutator) for setServiceDescription
    public void setServiceDescription (String service) {
        serviceDescription = service;
    }
    
    // Declare setter (mutator) for setPrice
    public void setPrice (double servicePrice) {
        price = servicePrice;
    }
    
    // Declare getter (accessor) for getServiceDescription
    public String getServiceDescription() {
        return serviceDescription;
    }
    
    // Declare getter (accessor) for getPrice
    public double getPrice() {
        return price;
    }
}

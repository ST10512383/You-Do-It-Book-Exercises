package com.mycompany.paradiseinfo;

// Import JOptionPane
import javax.swing.JOptionPane;

public class ParadiseInfo2 {

    public static void main(String[] args) {
        
        // Declare three variables
        double price;
        double discount;
        double savings;
        
        // Ask user for full price with GUI
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter cutoff price for discount"));
        
        // Ask user for discount with GUI
        discount = Double.parseDouble(JOptionPane.showInputDialog("Enter discount rate as a whole number"));
        
        // Assign method to variable
        savings = computeDiscountInfo(price, discount);
        
        // Concatinate strings into one variable
        String message = "Special this week on any service over " + price + " Discount of " + discount + " percent " + "That's savings of at least $" + savings;
        
        // Use JOptionPane to show GUI messages to the customer
        JOptionPane.showMessageDialog(null, message);
    }
    
    // Calculate Discount and return the discount
    public static double computeDiscountInfo(double price, double discountRate){
        double savings;
        savings = price * discountRate / 100;
        return savings;
    }
    
    // Create displayInfo that prints out statements to output
    public static void displayInfo(){
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }
}

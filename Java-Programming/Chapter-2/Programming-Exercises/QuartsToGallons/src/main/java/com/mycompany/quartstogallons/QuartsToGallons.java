package com.mycompany.quartstogallons;

public class QuartsToGallons {

    public static void main(String[] args) {
        final double QUARTS = 4;
        double quartsNeeded = 18;
        double leftOverQuarts = ((quartsNeeded / QUARTS) - 4) * 4;
        
        System.out.println("A job that needs " + (int) quartsNeeded + " quarts requires " + (int) QUARTS + " gallons plus " + (int) leftOverQuarts + " quarts");
    }
}

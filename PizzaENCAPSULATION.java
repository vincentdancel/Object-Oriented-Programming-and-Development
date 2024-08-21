package com.mycompany.pizza;

public class Pizza {

    // a. Create a class named Pizza. Data fields include a String for toppings (such as pepperoni),
    //an integer for diameter in inches (such as 12), and a double for price (such as 13.99).
    // Include methods to get and set values for each of these fields. Save the class as Pizza.java. 
    //b. Create an application named TestPizza that instantiates one Pizza object and 
    //demonstrates the use of the Pizza set and get methods. Save this application as TestPizza.java.
    
    private String toppings;
    private int diameter;
    private double price;

    public Pizza(String toppings, int diameter, double price) {
        this.toppings = toppings;
        this.diameter = diameter;
        this.price = price;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;

    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;

    }

    public void setPrice(double price) {
        this.price = price;

    }

    public String getToppings() {
        return toppings;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPrice() {
        return price;
    }
}
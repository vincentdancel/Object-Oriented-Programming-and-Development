package com.mycompany.pizza;

import javax.swing.JOptionPane;

public class TestPizza {

    public static void main(String[] args) {

        Pizza n = new Pizza("peperoni", 12, 13.99);

        JOptionPane.showMessageDialog(null, "Set of Toppings: " + n.getToppings()
                + "\nSet of Diameter: " + n.getDiameter()
                + "\nSet price: " + n.getPrice());

        n.setToppings("peperoni");
        n.setDiameter(12);
        n.setPrice(13.99);

        JOptionPane.showMessageDialog(null, "Get Toppings: " + n.getToppings()
                + "\nGet Diameter: " + n.getDiameter()
                + "\nThe price: " + n.getPrice());

    }

}

package com.mycompany.commission2;

import java.util.Scanner;

public class Commission2 {

    static double sales;
    static double comRate;
    static int comRates;

    public static void computeCommission(double sales, double comRates) {
        double comCommission = sales * comRates;
        System.out.println("Commission based on double sales and rates: " + comCommission);
    }

    public static void computeCommission(double sales, int comRates) {
        double DivCommissionsRate = 100.0 / comRates;
        double MulCommissionsRate = sales * DivCommissionsRate;
        System.out.println("Commission based on double sales and integer rates: " + MulCommissionsRate);
    }

    public static void computeCommission(double sales) {
        double fixedRate = 7.5;
        double totalSales = sales * fixedRate;
        System.out.println("Commission based on sales: " + totalSales);
    }

    public static void main(String[] args) {
        Scanner com = new Scanner(System.in);

        System.out.println("Enter the sales number:");
        sales = com.nextDouble();

        System.out.println("Enter the rate number with a DECIMAL:");
        comRate = com.nextDouble();

        System.out.println("Enter the rate number (integer):");
        comRates = com.nextInt();

        computeCommission(sales, comRate);
        computeCommission(sales, comRates);
        computeCommission(sales);

        com.close();
    }
}

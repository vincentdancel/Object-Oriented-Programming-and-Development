package pay;

import java.util.Scanner;

public class Pay {

    static double hoursWorked;
    static double RatePayPerHour;
    static double withHoldingRate;
    static double grossPay;
    static double netPay;

    public static void computeNetPay(double hoursWorked, double RatePayPerHour, double withHoldingRate) {
        grossPay = hoursWorked * RatePayPerHour;
        netPay = grossPay - (withHoldingRate * grossPay);
        System.out.println("The net pay is:" + netPay);
        System.out.println("The gross pay is:" + grossPay);

    }

    public static void computeNetPay(double hoursWorked, double RatePayPerHour) {
        withHoldingRate = 0.15;

        grossPay = hoursWorked * RatePayPerHour;
        netPay = grossPay - (withHoldingRate * grossPay);
        System.out.println("The net pay is:" + netPay);
        System.out.println("The gross pay is:" + grossPay);
    }

    public static void computeNetPay(double hoursWorked) {
        RatePayPerHour = 5.85;
        withHoldingRate = 0.15;
        grossPay = hoursWorked * RatePayPerHour;
        netPay = grossPay - (withHoldingRate * grossPay);
        System.out.println("The net pay is:" + netPay);
        System.out.println("The gross pay is:" + grossPay);
    }

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);

        System.out.println("Enter the hours worked:");
        hoursWorked = b.nextDouble();
        System.out.println("Enter the rate pay per hour:");
        RatePayPerHour = b.nextDouble();
        System.out.println("Enter the with holding rate:");
        withHoldingRate = b.nextDouble();

        computeNetPay(hoursWorked, RatePayPerHour, withHoldingRate);
        System.out.println("\n");
        computeNetPay(hoursWorked, RatePayPerHour);
        System.out.println("\n");
        computeNetPay(hoursWorked);

        b.close();
    }

}

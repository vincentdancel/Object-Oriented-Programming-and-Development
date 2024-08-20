package javaapplication3;

public class JavaApplication3 {
    //construct a blueprint class for computing the area of circle, triangle,square, and rectangle.
    // The main class should accept 2 numbers from the users and he/she should decide either to compute for area of circle, triangle,square, 
    //     and rectangle then the first number will be use for area of circle and square.

    private double num1;
    private double num2;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getCircle(double num1, double num2) {
        return 3.14 * num1 * num2;
    }

    public double getTriangle(double num1, double num2) {
        return num1 * num2 / 2;
    }

    public double getSquare(double num1, double num2) {
        return num1 * num2;
    }

    public double getRectangle(double num1, double num2) {
        return num1 * num1;
    }
}

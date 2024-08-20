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

(SEPARATE FILES)

package javaapplication3;

import javax.swing.JOptionPane;

public class Shape {

    public static void main(String[] args) {

        JavaApplication3 t = new JavaApplication3();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Solve for:\n 1. Circle\n 2. Triangle\n 3. Square\n 4. Rectange"));

        switch (choice) {

            case 1:
                double circle = t.getCircle(n1, n2);
                JOptionPane.showMessageDialog(null, "Area of Circle: " + circle);
                JOptionPane.showMessageDialog(null, "Area of Triangle: " + t.getTriangle(n1, n2) + "\nArea of Square: " + t.getSquare(n1, n2) + "\nArea of Rectangle: " + t.getRectangle(n1, n2), "Other Results:", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 2:
                double triangle = t.getTriangle(n1, n2);
                JOptionPane.showMessageDialog(null, "Area of Triangle: " + triangle);
                JOptionPane.showMessageDialog(null, "Area of Circle: " + t.getCircle(n1, n2) + "\nArea of Square: " + t.getSquare(n1, n2) + "\nArea of Rectangle: " + t.getRectangle(n1, n2), "Other Results:", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3:
                double square = t.getSquare(n1, n2);
                JOptionPane.showMessageDialog(null, "Area of Square: " + square);
                JOptionPane.showMessageDialog(null, "Area of Circle: " + t.getCircle(n1, n2) + "\nArea of Triangle: " + t.getTriangle(n1, n2) + "\nArea of Rectangle: " + t.getRectangle(n1, n2), "Other Results:", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 4:
                double rectangle = t.getRectangle(n1, n2);
                JOptionPane.showMessageDialog(null, "Area of Rectangle: " + rectangle);
                JOptionPane.showMessageDialog(null, "Area of Circle: " + t.getCircle(n1, n2) + "\nArea of Triangle: " + t.getTriangle(n1, n2) + "\nArea of Square: " + t.getSquare(n1, n2), "Other Results:", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid Input");
                break;

        }

    }
}


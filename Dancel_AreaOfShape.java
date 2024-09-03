package areaofshape;

import javax.swing.JOptionPane;

public class AreaOfShape {

    private int num1;
    private int num2;
    private int choice;
    private String message;

    public int getNum1() {

        return num1;

    }

    public void setNum1(int num1) {

        this.num1 = num1;

    }

    public int getNum2() {

        return num2;

    }

    public void setNum2(int num2) {

        this.num2 = num2;

    }

    public double computeAreaOfShape(int num1) {

        if (this.choice == 1) {
            setNum1(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
            return 3.1416 * (this.num1 * this.num1);

        } else if (this.choice == 2) {
            setNum1(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
            return this.num1 * this.num1;
        }
        return this.num1;
    }

    public double computeAreaOfShape(int num1, int num2) {

        if (this.choice == 3) {
            setNum1(Integer.parseInt(JOptionPane.showInputDialog("Enter number 1")));
            setNum2(Integer.parseInt(JOptionPane.showInputDialog("Enter number 2")));
            return (this.num1 * this.num1) / 2;

        } else if (this.choice == 4) {
            setNum1(Integer.parseInt(JOptionPane.showInputDialog("Enter number 1")));
            setNum2(Integer.parseInt(JOptionPane.showInputDialog("Enter number 2")));
            return this.num1 * this.num2;
        }
        return this.num1 + this.num2;
    }

    public int getChoice() {

        return choice;

    }

    public void setChoice(int choice) {

        this.choice = choice;

    }

    public String display() {
        this.message = "The Area of";

        switch (choice) {
            case 1:
                message += " circle is " + computeAreaOfShape(0) + "\nGiven number: " + this.num1;
                break;
            case 2:
                message += " square is " + computeAreaOfShape(0) + "\nGiven number: " + this.num1;
                break;
            case 3:
                message += " triangle is " + computeAreaOfShape(0, 0) + "\nGiven number 1: " + this.num1 + "\nGiven number 2: " + this.num2;
                break;
            case 4:
                message += " rectangle is " + computeAreaOfShape(0, 0) + "\nGiven number 1: " + this.num1 + "\nGiven number 2: " + this.num2;
                break;
        }

        return message;
    }
}

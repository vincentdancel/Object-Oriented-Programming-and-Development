package act1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String num1Choice = JOptionPane.showInputDialog("Enter fist number.");
        int choice1 = Integer.parseInt(num1Choice);

        String num2Choice = JOptionPane.showInputDialog("Enter second number.");
        int choice2 = Integer.parseInt(num2Choice);


        int sum;
        sum = sum(choice1, choice2);

        int dif;
        dif = dif(choice1, choice2);

        int mul;
        mul = mul(choice1, choice2);

        int div;
        div = div(choice1, choice2);

        JOptionPane.showMessageDialog(null, "The sum is :" + sum 
                + "\nThe difference is :"+ dif 
                + "\nThe product is :" + mul 
                + "\nThe quotient is :" + div );
    }

    public static int sum(int choice1, int choice2) {
        int total = choice1 + choice2;
        return total;
    }

     public static int dif(int choice1, int choice2) {
        int total = choice1 - choice2;
        return total;
    }

     public static int mul(int choice1, int choice2) {
        int total = choice1 * choice2;
        return total;
    }

    public static int div(int choice1, int choice2) {
        int total = choice1 / choice2;
        return total;
    }
}

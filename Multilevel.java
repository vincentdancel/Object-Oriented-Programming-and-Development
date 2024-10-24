package multilevel;

import javax.swing.JOptionPane;

class Building {

    private String name;

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Library extends Building {

    private int numberOfBooks;

    public Library(String name, int numberOfBooks) {
        super(name);
        this.numberOfBooks = numberOfBooks;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
}

class ComputerLab extends Library {

    private int numberOfComputers;

    public ComputerLab(String name, int numberOfBooks, int numberOfComputers) {
        super(name, numberOfBooks);
        this.numberOfComputers = numberOfComputers;
    }

    public int getNumberOfComputers() {
        return numberOfComputers;
    }
}

public class Multilevel {

    public static void main(String[] args) {

        String buildingName = JOptionPane.showInputDialog("Enter the building name:");

        int numberOfBooks = 0;
        String booksInput = JOptionPane.showInputDialog("Enter the number of books:");
        numberOfBooks = Integer.parseInt(booksInput);

        int numberOfComputers = 0;
        String computersInput = JOptionPane.showInputDialog("Enter the number of computers:");
        numberOfComputers = Integer.parseInt(computersInput);

        
        ComputerLab lab = new ComputerLab(buildingName, numberOfBooks, numberOfComputers);

        String message = "Building Name: " + lab.getName() + "\n"
                + "Number of Books: " + lab.getNumberOfBooks() + "\n"
                + "Number of Computers: " + lab.getNumberOfComputers();

        JOptionPane.showMessageDialog(null, message, "Campus Building Info", JOptionPane.INFORMATION_MESSAGE);
    }
}

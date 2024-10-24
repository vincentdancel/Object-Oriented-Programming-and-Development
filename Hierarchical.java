package hierarchical;

import javax.swing.JOptionPane;

class Building {

    protected String name;

    public Building(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Building Name: " + name;
    }
}

class Library extends Building {

    private int numBooks;

    public Library(String name, int numBooks) {
        super(name);
        this.numBooks = numBooks;
    }

    public String getInfo() {
        return super.getInfo() + "\nNumber of Books: " + numBooks;
    }
}

class Laboratory extends Building {

    private String equipment;

    public Laboratory(String name, String equipment) {
        super(name);
        this.equipment = equipment;
    }

    public String getInfo() {
        return super.getInfo() + "\nEquipment: " + equipment;
    }
}



class hierarchical {

    public static void main(String[] args) {
        String[] options = {"Library", "Laboratory"};
        int choice = JOptionPane.showOptionDialog(null, "Select a building type:", "Campus Building",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        String name = JOptionPane.showInputDialog("Enter the building name:");

        if (choice == 0) { // kini kay para sa library
            String books = JOptionPane.showInputDialog("Enter number of books:");
            Library library = new Library(name, Integer.parseInt(books));
            JOptionPane.showMessageDialog(null, library.getInfo());
            
        } else if (choice == 1) { // kini kay para sa laboratory
            String equipment = JOptionPane.showInputDialog("Enter equipment:");
            Laboratory laboratory = new Laboratory(name, equipment);
            JOptionPane.showMessageDialog(null, laboratory.getInfo());
            
        } else {
            JOptionPane.showMessageDialog(null, "No selection made.");
        }
    }
}
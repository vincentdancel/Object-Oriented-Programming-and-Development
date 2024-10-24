package hybrid;

import javax.swing.JOptionPane;

class Building {

    String name;
    int floors;

    Building(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    String getInfo() {
        return "Building Name: " + name + "\nNumber of Floors: " + floors;
    }
}

class Library extends Building {

    int books;

    Library(String name, int floors, int books) {
        super(name, floors);
        this.books = books;
    }

    String getInfo() {
        return super.getInfo() + "\nNumber of Books: " + books;
    }
}

class Laboratory extends Building {

    String equipment;

    Laboratory(String name, int floors, String equipment) {
        super(name, floors);
        this.equipment = equipment;
    }

    String getInfo() {
        return super.getInfo() + "\nEquipment: " + equipment;
    }
}

class Campus {  // gamit para sa na gather na info sa lib og lab na subclass

    public static void main(String[] args) {
        Library library = new Library("Central Library", 3, 15000);
        Laboratory lab = new Laboratory("Physics Lab", 2, "Oscilloscope");

        StringBuilder message = new StringBuilder();
        message.append(library.getInfo()).append("\n\n");
        message.append(lab.getInfo());

        JOptionPane.showMessageDialog(null, message.toString(), "Campus Buildings", JOptionPane.INFORMATION_MESSAGE);
    }
}

// Base Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Interface for Flying Behavior
interface Flyable {
    void fly();
}

// Intermediate Class (Single Inheritance from Animal)
class Bird extends Animal {
    void layEggs() {
        System.out.println("This bird lays eggs.");
    }
}

// Derived Class (Multiple Inheritance using Interface)
class Bat extends Animal implements Flyable {
    void nocturnal() {
        System.out.println("This bat is nocturnal.");
    }

    @Override
    public void fly() {
        System.out.println("This bat can fly.");
    }
}

// Main Class to Test the Hybrid Inheritance
public class HybridInheritanceExample {
    public static void main(String[] args) {
        // Array of Animal objects
        Animal[] animals = new Animal[2];
        animals[0] = new Bird();
        animals[1] = new Bat();

        // Loop through the array and perform actions
        for (Animal animal : animals) {
            animal.eat();
            if (animal instanceof Bird) {
                ((Bird) animal).layEggs();
            } else if (animal instanceof Bat) {
                Bat bat = (Bat) animal;
                bat.nocturnal();
                bat.fly();
            }
        }
    }
}


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

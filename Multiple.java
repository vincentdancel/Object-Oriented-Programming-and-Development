package multiple;

import javax.swing.JOptionPane;

interface Security {

    public void secureBuilding();
}

interface Maintenance {

    public void cleanBuilding();
}

class CampusBuilding implements Security, Maintenance {

    private String name;

    public CampusBuilding(String name) {
        this.name = name;
    }

    public void secureBuilding() {
        JOptionPane.showMessageDialog(null, name + " is secured.");
    }

    public void cleanBuilding() {
        JOptionPane.showMessageDialog(null, name + " is being cleaned.");
    }

    public void displayInfo() {
        JOptionPane.showMessageDialog(null, "Building Name: " + name);
        secureBuilding();
        cleanBuilding();
    }
}

public class Multiple {

    public static void main(String[] args) {

        String buildingName = JOptionPane.showInputDialog("Enter the name of the building:");

        CampusBuilding building = new CampusBuilding(buildingName);
        building.displayInfo();

    }
}

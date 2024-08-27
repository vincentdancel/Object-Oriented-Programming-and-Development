package computerlab;

public class ComputerLab {

    private String monitorBrand;
    private float monitorSize;
    private int numOfChairs;
    private int numOfLight;
    private boolean hasWifi;
    private boolean hasWhiteBoard;

    public ComputerLab() {
        this.monitorBrand = "ASUS";
        this.monitorSize = 20.7f;
        this.numOfChairs = 40;
        this.numOfLight = 12;
        this.hasWifi = true;
        this.hasWhiteBoard = true;
    }
    
    public String getMonitorBrand() {
        return monitorBrand;
    }

    public void setMonitorBrand(String monitorBrand) {
        this.monitorBrand = monitorBrand;
    }

    public float getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(float monitorSize) {
        this.monitorSize = monitorSize;
    }

    public int getNumOfChairs() {
        return numOfChairs;
    }

    public void setNumOfChairs(int numOfChairs) {
        this.numOfChairs = numOfChairs;
    }

    public int getNumOfLight() {
        return numOfLight;
    }

    public void setNumOfLight(int numOfLight) {
        this.numOfLight = numOfLight;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasWhiteBoard() {
        return hasWhiteBoard;
    }

    public void setHasWhiteBoard(boolean hasWhiteBoard) {
        this.hasWhiteBoard = hasWhiteBoard;
    }

}

---------------------------------------------------------

    package computerlab;

public class TestComputer {

    public static void main(String[] args) {
        ComputerLab clb1 = new ComputerLab();

        System.out.println("Brand: " +clb1.getMonitorBrand());
        System.out.println("Monitor Size: " + clb1.getMonitorSize());
        System.out.println("Number of Chairs: " + clb1.getNumOfChairs());
        System.out.println("Number of Light: " + clb1.getNumOfLight());
        System.out.println("Has Wi-fi? - " +clb1.isHasWifi());
        System.out.println("Has White Board? - " + clb1.isHasWhiteBoard());

    }
}

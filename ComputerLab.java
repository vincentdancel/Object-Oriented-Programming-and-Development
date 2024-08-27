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

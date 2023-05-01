package OperatingSystemPackage;

public class OperatingSystem {
    private int year;
    public OperatingSystem(int year) {
        this.year = year;
    }
    public void turnOn() {
        System.out.println("System starting...");
    }
    public void turnOff() {
        System.out.println("System closing...");
    }
    public void displayYear() {
        System.out.println("Data produkcji: " + year);
    }
    public int getYear() {
        return year;
    }
}

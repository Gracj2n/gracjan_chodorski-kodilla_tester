package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;
    public OperatingSystem (int year) {
        this.year = year;
    }
    public void turnOn() {
        System.out.println("System is starting.");
    }
    public void turnOff() {
        System.out.println("System is closing.");
    }
    public void displayYear() {
        System.out.println("This system were released in " + year);
    }
    public int getYear() {
        return year;
    }
}

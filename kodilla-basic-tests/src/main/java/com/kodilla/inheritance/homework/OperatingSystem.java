package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;
    private double date;
    public OperatingSystem (int year, double date) {
        this.year = year;
        this.date = date;
    }
    public void turnOn() {
        System.out.println("System is starting.");
    }
    public void turnOff() {
        System.out.println("System is closing.");
    }
    public void displayYear() {
        System.out.println("This system released in " + year);
    }
    public void displayLastUpdate() {
        System.out.println("Last update: " + date + "0");
    }
    public int getYear() {
        return year;
    }
    public double getDate() {
        return date;
    }
}

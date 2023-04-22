package com.kodilla.inheritance.homework;

public class OperatingSystemUpdateV1 extends OperatingSystem {
    public OperatingSystemUpdateV1 (int year, double date) {
        super(year, date);
    }
    @Override
    public void displayLastUpdate() {
        System.out.println("Lastest update: " + getDate());
    }

}

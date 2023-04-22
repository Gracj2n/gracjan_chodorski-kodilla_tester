package com.kodilla.inheritance.homework;

public class OperatingSystemUpdateV2 extends OperatingSystem {
    public OperatingSystemUpdateV2(int year, double date) {
        super(year, date);
    }
    @Override
    public void displayLastUpdate() {
        System.out.println("Lastest update: " + getDate());
    }

}

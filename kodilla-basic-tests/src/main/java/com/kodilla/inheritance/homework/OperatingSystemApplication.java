package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {
        OperatingSystem windows_11 = new OperatingSystem(2021);
        System.out.println("System Windows 11");
        System.out.println("");
        windows_11.turnOn();
        windows_11.displayYear();
        windows_11.turnOff();
        System.out.println("");

        OperatingSystemUpdateV1 win11_update_1 = new OperatingSystemUpdateV1(2024);
        win11_update_1.turnOn();
        win11_update_1.displayYear();
        win11_update_1.turnOff();
        System.out.println("");

        OperatingSystemUpdateV2 win11_update_2 = new OperatingSystemUpdateV2(2027);
        win11_update_2.turnOn();
        win11_update_2.displayYear();
        win11_update_2.turnOff();

    }
}

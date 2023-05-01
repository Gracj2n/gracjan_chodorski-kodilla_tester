package OperatingSystemPackage;

public class OperatingSystemApplication {
    public static void main(String[] args) {

        SystemWindows systemWindows = new SystemWindows(2020);
        systemWindows.turnOn();

        systemWindows.displayYear();

        systemWindows.turnOff();

        System.out.println("");

    }
}

package OperatingSystemPackage;

public class SystemWindows extends OperatingSystem{
    public SystemWindows(int year) {
        super(year);
    }

    @Override
    public void displayYear() {
        System.out.println("Data wydania: " + getYear());
    }
}

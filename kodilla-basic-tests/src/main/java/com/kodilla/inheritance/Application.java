package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(3,2);
        //car.turnOnLights();

        System.out.println("");

        Convertible convertible = new Convertible(4,5);
        //convertible.openRoof();
        System.out.println(convertible.getSeats());     //pobieranie konkretnej zmennej z klasy Car
        System.out.println(car.getSeats());             //pobieranie konkretnej zmennej z klasy Car

        car.displayNumberOfSeats();
    }
}

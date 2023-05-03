package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        Mazda mazda = new Mazda();
        Opel opel = new Opel();

        doRace(ford);
        System.out.println();
        doRace(mazda);
        System.out.println();
        doRace(opel);
    }
    private static void doRace(Car car) {
        System.out.println("Aktualna prędkość: "+ car.getSpeed(150));
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
    }
}

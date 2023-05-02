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
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}

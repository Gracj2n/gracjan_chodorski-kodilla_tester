package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        Mazda mazda = new Mazda();
        Opel opel = new Opel();

        ford.getSpeed();
        mazda.getSpeed();
        opel.getSpeed();

        doRace(ford);

    }
    private static void doRace(Car car) {

    }
}

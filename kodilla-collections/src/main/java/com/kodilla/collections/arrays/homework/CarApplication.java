package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {
    private static final Random random = new Random();
    public static void main(String[] args) {
        Car[] cars = new Car[random.nextInt(15) + 1];
        for ( int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car  car : cars) {
            CarUtils.describeCar(car);
        }
    }
    public static Car drawCar() {
        int drawnCarModel = random.nextInt(3);
        if (drawnCarModel == 0) {
            return new Ford();
        } else if (drawnCarModel == 1) {
            return new Opel();
        } else if(drawnCarModel == 2) {
            return new Mazda();
        } else {
            return null;
        }
    }
}

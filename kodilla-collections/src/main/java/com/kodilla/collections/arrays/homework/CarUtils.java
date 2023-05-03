package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarUtils {
    private static final Random random = new Random();
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car model: " + getCarModel(car));
        System.out.println("Car speed: " + getRandomSpeed());
        System.out.println("Car engine power: " + getRandomEngine());
    }
    private static String getCarModel(Car car) {
        if (car instanceof Mazda)
            return "Mazda";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car model";
    }
    private static int getRandomSpeed() {
        return random.nextInt(20) * 10;
    }
    private static int getRandomEngine() {
        return random.nextInt(100) + 70;
    }
}


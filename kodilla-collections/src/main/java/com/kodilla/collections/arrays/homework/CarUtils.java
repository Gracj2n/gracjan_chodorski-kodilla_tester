package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarUtils {
    private static final Random random = new Random();
    public static int getRandomSpeed() {
        return random.nextInt(20) * 10;
    }
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car model: " + getCarModel(car));
        System.out.println("Car speed: " + getRandomSpeed());
    }
    private static String getCarModel(Car car) {
        if (car instanceof Mazda)
            return "Mazda";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Honda";
        else
            return "Unknown car model";
    }
}


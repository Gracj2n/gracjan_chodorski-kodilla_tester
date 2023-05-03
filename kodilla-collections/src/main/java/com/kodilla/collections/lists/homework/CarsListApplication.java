package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();

        Ford ford1 = new Ford();

        cars.add(ford1);
        cars.add(new Ford());
        cars.add(new Ford());

        cars.remove(ford1);
        cars.remove(0);

        System.out.println("Rozmiar kolekcji: " + cars.size());

        for(Ford car : cars) {
            System.out.println("Prędkość: " + car.getSpeed(150));
        }
    }
}

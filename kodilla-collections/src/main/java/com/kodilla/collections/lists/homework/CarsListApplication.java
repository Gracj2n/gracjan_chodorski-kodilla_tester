package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Ford ford1 = new Ford();
        Ford ford2 = new Ford();
        Ford ford3 = new Ford();

        cars.add(ford1);
        cars.add(ford2);
        cars.add(ford3);

        cars.remove(ford3);
        cars.remove(1);

        System.out.println("Rozmiar kolekcji: " + cars.size());

        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}

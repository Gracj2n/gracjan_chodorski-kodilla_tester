package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabriolet implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(6,0)) && time.isBefore(LocalTime.of(20,0))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "Cabriolet";
    }

    @Override
    public String toString() {
        return "Cabriolet{}";
    }
}

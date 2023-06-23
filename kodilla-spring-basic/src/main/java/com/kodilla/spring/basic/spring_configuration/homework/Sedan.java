package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sedan implements Car{
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
        return "Sedan";
    }
}

package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for(Flight flightFrom : FlightRepository.getFlightsTable()) {
            if (flightFrom.getDeparture().equals(departure)) {
                result.add(flightFrom);
            }
        }
        return result;
    }
    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for(Flight flightTo : FlightRepository.getFlightsTable()) {
            if (flightTo.getArrival().equals(arrival)) {
                result.add(flightTo);
            }
        }
        return result;
    }
}

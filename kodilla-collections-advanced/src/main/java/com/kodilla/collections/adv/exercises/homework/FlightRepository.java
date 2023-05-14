package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flight = new ArrayList<>();

        flight.add(new Flight("Berlin", "Warsaw"));
        flight.add(new Flight("Kraków", "Paris"));
        flight.add(new Flight("Milan", "Berlin"));
        flight.add(new Flight("Berlin", "Modlin"));
        flight.add(new Flight("Warsaw", "Milan"));

        return flight;
    }
}

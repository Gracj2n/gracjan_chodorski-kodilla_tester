package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void doesFindFlightsFromBerlin() {
        //given
        FlightFinder flightFind = new FlightFinder();
        String flight = "Berlin";
        //when
        List<Flight> flightFrom = flightFind.findFlightsFrom(flight);
        //then
        List<Flight> expectedFlight = new ArrayList<>();
        expectedFlight.add(new Flight("Berlin", "Warsaw"));
        expectedFlight.add(new Flight("Berlin", "Modlin"));
        assertEquals(expectedFlight, flightFrom);
    }

    @Test
    public void doesFindFlightsFromWarsaw() {
        //given
        FlightFinder flightFind = new FlightFinder();
        String flight = "Warsaw";
        //when
        List<Flight> flightFrom = flightFind.findFlightsFrom(flight);
        //then
        List<Flight> expectedFlight = new ArrayList<>();
        expectedFlight.add(new Flight("Warsaw", "Milan"));
        assertEquals(expectedFlight, flightFrom);
    }

    @Test
    public void doesFindFlightsToBerlin() {
        //given
        FlightFinder flightFind = new FlightFinder();
        String flight = "Berlin";
        //when
        List<Flight> flightTo = flightFind.findFlightsTo(flight);
        //then
        List<Flight> expectedFlight = new ArrayList<>();
        expectedFlight.add(new Flight("Milan", "Berlin"));
        assertEquals(expectedFlight, flightTo);
    }
    @Test
    public void doesFindFlightsToWarsaw() {
        //given
        FlightFinder flightFind = new FlightFinder();
        String flight = "Warsaw";
        //when
        List<Flight> flightTo = flightFind.findFlightsTo(flight);
        //then
        List<Flight> expectedFlight = new ArrayList<>();
        expectedFlight.add(new Flight("Berlin", "Warsaw"));
        assertEquals(expectedFlight, flightTo);
    }

    @Test
    public void doesFindFlightsToMilan() {
        //given
        FlightFinder flightFind = new FlightFinder();
        String flight = "Milan";
        //when
        List<Flight> flightTo = flightFind.findFlightsTo(flight);
        //then
        List<Flight> expectedFlight = new ArrayList<>();
        expectedFlight.add(new Flight("Warsaw", "Milan"));
        assertEquals(expectedFlight, flightTo);
    }

}
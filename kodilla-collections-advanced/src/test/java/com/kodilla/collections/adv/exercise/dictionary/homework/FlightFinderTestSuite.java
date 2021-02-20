package com.kodilla.collections.adv.exercise.dictionary.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    public void init() {

        Flight flight1 = new Flight("Paryż", "Londyn");
        Flight flight2 = new Flight("Londyn", "Rzym");
        Flight flight3 = new Flight("Paryż", "Rzym");
        Flight flight4 = new Flight("Warszawa", "Paryż");

        FlightRepository.addFlight(flight1);
        FlightRepository.addFlight(flight2);
        FlightRepository.addFlight(flight3);
        FlightRepository.addFlight(flight4);
    }

    @Test
    public void testFindFlightsFrom() {
        init();
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights;
        flights = flightFinder.findFlightsFrom("Paryż");
        assertEquals(2, flights.size());
        assertEquals("Paryż", flights.get(0).getDeparture());
        assertEquals("Paryż", flights.get(1).getDeparture());
    }
    @Test
    public void testFindFlightsTo() {
        init();
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights;
        flights = flightFinder.findFlightsTo("Rzym");
        assertEquals(2, flights.size());
        assertEquals("Rzym", flights.get(0).getArrival());
        assertEquals("Rzym", flights.get(1).getArrival());
    }
}
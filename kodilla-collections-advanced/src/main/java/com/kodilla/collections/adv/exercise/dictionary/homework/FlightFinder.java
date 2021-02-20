package com.kodilla.collections.adv.exercise.dictionary.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flights = new ArrayList<>();
        for (Flight flightCurrent : FlightRepository.getFlightsTable()) {
            if (flightCurrent.getDeparture().equals(departure)) {
                flights.add(flightCurrent);
            }
        }
        return flights;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flights = new ArrayList<>();
        for (Flight flightCurrent : FlightRepository.getFlightsTable()) {
            if (flightCurrent.getArrival().equals(arrival)) {
                flights.add(flightCurrent);
            }
        }
        return flights;
    }
}

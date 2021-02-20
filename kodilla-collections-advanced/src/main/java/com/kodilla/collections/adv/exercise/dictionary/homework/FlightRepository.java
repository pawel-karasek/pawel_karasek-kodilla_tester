package com.kodilla.collections.adv.exercise.dictionary.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    static List<Flight> flightsTable = new ArrayList<>();

    public static void addFlight(Flight flight) {
        flightsTable.add(flight);
    }

    public static List<Flight> getFlightsTable() {

        return flightsTable;
    }
}

package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> director = new HashMap<>();
        Principal mrSmith = new Principal("John", "Smith");
        Principal msJohnson = new Principal("Margaret", "Johnson");
        Principal msBlack = new Principal("Ann", "Black");

        School school1 = new School("School1", new Klasa("1a", 30),
                new Klasa("1b", 25), new Klasa("1c", 27));
        School school2 = new School("School2", new Klasa("2a", 15),
                new Klasa("2b", 23), new Klasa("2c", 26));
        School school3 = new School("School3", new Klasa("3a", 29),
                new Klasa("3b", 15), new Klasa("3c", 21));

        director.put(mrSmith, school1);
        director.put(msJohnson, school2);
        director.put(msBlack, school3);

        for (Map.Entry<Principal, School> directorEntry : director.entrySet()) {
            System.out.println(directorEntry);
        }
    }
}

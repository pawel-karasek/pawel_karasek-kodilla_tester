package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("stamp1", 2.0, 1.5, true));
        stamps.add(new Stamp("stamp2", 3.4, 2.2, false));
        stamps.add(new Stamp("stamp3", 1.8,3.4, false));
        stamps.add(new Stamp("stamp2", 3.4, 2.2, false));
        stamps.add(new Stamp("stamp3", 1.8,3.4, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}

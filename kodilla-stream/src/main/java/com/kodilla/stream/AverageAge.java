package com.kodilla.stream;

import java.util.stream.Collector;

public class AverageAge {
    public static void main(String[] args) {
        double avr = UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avr);

    }
}

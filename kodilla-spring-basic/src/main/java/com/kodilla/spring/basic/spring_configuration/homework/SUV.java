package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class SUV implements Car {

    @Override
    public Boolean HasHeadlightsTurnedOn(LocalTime time) {
        if (time.isAfter(LocalTime.of(20, 00, 00))
                && time.isBefore(LocalTime.of(06, 00, 00))) {
            return true;
        }
        return false;
    }

    @Override
    public String getCarType(String season) {
        return "The best car to ride during " + season + " is SUV";
    }
}

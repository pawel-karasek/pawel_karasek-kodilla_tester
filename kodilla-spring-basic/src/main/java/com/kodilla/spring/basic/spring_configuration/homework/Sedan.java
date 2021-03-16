package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

@Component
public class Sedan implements Car {

    private boolean headlightsOn = false;

    @Override
    public void setHeadlightsOn() {
        headlightsOn = true;
    }

    @Override
    public Boolean hasHeadlightsTurnedOn() {
        return headlightsOn;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}

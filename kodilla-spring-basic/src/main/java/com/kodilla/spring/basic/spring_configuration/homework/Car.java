package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    public Boolean HasHeadlightsTurnedOn(LocalTime time);

    public String getCarType(String season);
}

package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class Garage {
    private SUV suv;
    private Sedan sedan;
    private Cabrio cabrio;

    public Garage(SUV suv, Sedan sedan, Cabrio cabrio) {
        this.suv = suv;
        this.sedan = sedan;
        this.cabrio = cabrio;
    }

    @Bean
    public void chooseCar(String season, LocalTime time) {
        if (season == "winter") {
            if (suv.HasHeadlightsTurnedOn(time) == true) {
                System.out.println("Headlights turn on");
            } else {
                System.out.println("Headlights turn off");
            }
            suv.getCarType(season);

        } else if (season == "spring" || season == "autumn") {
            if (sedan.HasHeadlightsTurnedOn(time) == true) {
                System.out.println("Headlights turn on");
            } else {
                System.out.println("Headlights turn off");
            }
            sedan.getCarType(season);
        } else {
            if (cabrio.HasHeadlightsTurnedOn(time) == true) {
                System.out.println("Headlights turn on");
            } else {
                System.out.println("Headlights turn off");
            }
            cabrio.getCarType(season);
        }
    }
}
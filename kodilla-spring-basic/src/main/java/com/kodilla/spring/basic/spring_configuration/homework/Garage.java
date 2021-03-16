package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Configuration
public class Garage {

    @Bean
    public Car chooseCar(String season, LocalTime time) {
        Car car;
        if (season == "winter") {
            car = new SUV();


        } else if (season == "spring" || season == "autumn") {
            car = new Sedan();

        } else {
            car = new Cabrio();

        }
        if (time.isAfter(LocalTime.of(20, 00))
                && time.isBefore(LocalTime.of(06, 00))) {
            car.setHeadlightsOn();
        }
        return car;
    }
}
package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
class GarageTestSuite {

    @Test
    public void shouldRideSedanLightsOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework.sedan");
        Sedan bean = context.getBean(Sedan.class);
        Boolean headlightsOn = bean.HasHeadlightsTurnedOn(LocalTime.of(21,22,11));
        Assertions.assertTrue(headlightsOn == true);
    }
}
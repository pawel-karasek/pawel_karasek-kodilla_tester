package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

class OpelTest {
    Opel opel = new Opel();


    @Test
    void shouldGetSpeed() {
        opel.getSpeed();
    }

    @Test
    void shouldIncreaseSpeed() {
        opel.increaseSpeed();
    }

    @Test
    void shouldDecreaseSpeed() {
        opel.decreaseSpeed();
    }

    @Test
    void shouldGetSpeedIncrement() {
        opel.getSpeedIncrement();
    }

    @Test
    void shouldGetSpeedDecrement() {
        opel.getSpeedDecrement();
    }

    @Test
    void shouldGetName() {
        opel.getName();
    }

}
package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

class SyrenaTest {
    Syrena syrena = new Syrena();


    @Test
    void shouldGetSpeed() {
        syrena.getSpeed();
    }

    @Test
    void shouldIncreaseSpeed() {
        syrena.increaseSpeed();
    }

    @Test
    void shouldDecreaseSpeed() {
        syrena.decreaseSpeed();
    }

    @Test
    void shouldGetSpeedIncrement() {
        syrena.getSpeedIncrement();
    }

    @Test
    void shouldGetSpeedDecrement() {
        syrena.getSpeedDecrement();
    }

    @Test
    void shouldGetName() {
        syrena.getName();
    }

}
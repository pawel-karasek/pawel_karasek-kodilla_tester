package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

class FerrariTest {
    Ferrari ferrari = new Ferrari();

    @Test
    void shouldgetSpeed() {
        ferrari.getSpeed();
    }

    @Test
    void shouldIncreaseSpeed() {
        ferrari.increaseSpeed();
    }

    @Test
    void shouldDecreaseSpeed() {
        ferrari.decreaseSpeed();
    }

    @Test
    void shouldGetSpeedIncrement() {
        ferrari.getSpeedIncrement();
    }

    @Test
    void shouldGetSpeedDecrement() {
        ferrari.getSpeedDecrement();
    }

    @Test
    void shouldGetName() {
        ferrari.getName();
    }
}
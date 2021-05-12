package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperatingSystemTest {

    OperatingSystem operatingSystem;

    @BeforeEach
    void setUp() {
        operatingSystem = new OperatingSystem(2020);
    }

    @Test
    void shouldTurnOn() {
        operatingSystem.turnOn();
    }

    @Test
    void shouldTurnOff() {
        operatingSystem.turnOff();
    }
}
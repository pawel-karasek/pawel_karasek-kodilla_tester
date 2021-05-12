package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

class CarTest {
    Car car = new Car(4, 4);

    @Test
    void shouldTurnOnLights() {
        car.turnOnLights();
    }

    @Test
    void shouldOpenDors() {
        car.openDoors();
    }

    @Test
    void shouldGetWheels() {
        car.getWheels();
    }

    @Test
    void shouldGetSeats() {
        car.getSeats();
    }
}
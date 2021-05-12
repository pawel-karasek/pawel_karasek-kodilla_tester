package com.kodilla.abstracts.homeWork;

import org.junit.jupiter.api.Test;

class CircleTest {

    Circle circle = new Circle(5);

    @Test
    void shouldPrintSurfaceArea() {
        circle.surfaceArea();
    }

    @Test
    void shouldPrintCircuit() {
        circle.circuit();
    }
}
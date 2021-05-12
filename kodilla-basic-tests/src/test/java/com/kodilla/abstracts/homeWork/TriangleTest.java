package com.kodilla.abstracts.homeWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleTest {
    Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(5, 3);
    }

    @Test
    void shouldPrintSurfaceArea() {
        triangle.surfaceArea();
    }

    @Test
    void shouldPrintCircuit() {
        triangle.circuit();
    }

}
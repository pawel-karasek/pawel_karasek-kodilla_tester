package com.kodilla.abstracts.homeWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTest {
    Square square;

    @BeforeEach
    void setUp() {
        square = new Square(5);
    }

    @Test
    void shouldPrintSurfaceArea() {
        square.surfaceArea();
    }

    @Test
    void shouldPrintCircuit() {
        square.circuit();
    }
}
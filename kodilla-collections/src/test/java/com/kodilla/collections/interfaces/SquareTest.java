package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

class SquareTest {
    Square square = new Square(33);


    @Test
    void shouldGetArea() {
        System.out.println(square.getArea());
    }

    @Test
    void shouldGetPerimeter() {
        System.out.println(square.getPerimeter());
    }
}
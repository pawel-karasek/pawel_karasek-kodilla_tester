package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

class TriangleTest {
    Triangle triangle = new Triangle(33,44,55);


    @Test
    void shouldGetArea() {
        System.out.println(triangle.getArea());
    }

    @Test
    void shouldGetPerimeter() {
        System.out.println(triangle.getPerimeter());
    }
}
package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

class CircleTest {
    Circle circle = new Circle(2.2);

    @Test
    void shouldGetArea() {
        System.out.println(circle.getArea());
    }

    @Test
    void shouldGetPerimeter() {
        System.out.println(circle.getPerimeter());
    }
}
package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

class StampTest {
    Stamp stamp = new Stamp("horse", 5, 4, true);

    @Test
    void shouldGetName() {
        System.out.println(stamp.getName());
    }

    @Test
    void shouldGetHigh() {
        stamp.getHigh();
    }

    @Test
    void shouldGetWidth() {
        stamp.getWidth();
    }

    @Test
    void shouldPrintMarkedOrNot() {
        System.out.println(stamp.isStamped());
    }
}
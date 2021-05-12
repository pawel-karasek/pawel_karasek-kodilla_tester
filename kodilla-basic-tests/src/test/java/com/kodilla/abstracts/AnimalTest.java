package com.kodilla.abstracts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {

    Dog dog = new Dog(4);
    Duck duck = new Duck();

    @Test
    void shouldGiveVoice() {
        dog.giveVoice();
        duck.giveVoice();
    }

    @Test
    void shouldGetNumberOfLegs() {
        int legs = duck.getNumberOfLegs();
        Assertions.assertEquals(2, legs);
    }
}
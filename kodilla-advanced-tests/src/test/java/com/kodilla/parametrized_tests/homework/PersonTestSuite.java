package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @Test
    public void testBMIunder15() {
        //given
        Person p = new Person(1.72, 45);
        //when
        String result = p.getBMI();
        //then
        assertEquals("Severely underweight", result);
    }
}
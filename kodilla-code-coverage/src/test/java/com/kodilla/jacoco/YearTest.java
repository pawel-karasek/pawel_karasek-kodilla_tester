package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy400() {

        //given
        Year year = new Year(1601);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertEquals(false, isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4AndNotBy100() {

        //given
        Year year = new Year(1604);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfDivisibleBy100AndNotBy4() {

        //given
        Year year = new Year(1700);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertEquals(false, isLeapYear);
    }
}
package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTestSuite {
    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringToLowerCase(String input, String expected){
        assertEquals(expected, manipulator.reversWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test,4", " OtHEr ,5", "E V e n t,5", "null ,4", "A,1"})
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvFileSource(
            resources = "/stringWithCommas.csv",
            numLinesToSkip = 1,
            delimiter = ':',
            lineSeparator = "/n")
    public void shouldCountNumberOfCommas(String input, int expected) {
        assertEquals(expected, manipulator.countNumberOfCommas(input));
    }
}
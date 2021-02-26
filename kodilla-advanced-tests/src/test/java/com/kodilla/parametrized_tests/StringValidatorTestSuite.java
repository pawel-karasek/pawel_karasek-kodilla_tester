package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {
    private StringValidator stringValidator = new StringValidator();

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(stringValidator.isBlank("test"));
    }

    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
        assertTrue(stringValidator.isBlank(""));
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces() {
        assertTrue(stringValidator.isBlank("    "));
    }

    @Test
    public void shouldReturnTrueIfStringIsNull() {
        assertTrue(stringValidator.isBlank(null));
    }

    @ValueSource(strings = {" ", "    "})
    public void shouldReturnTrueIfStringIsEmpty3(String text) {
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfStringIsEmpty2(String text) {
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmptyOrNull(String text) {
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmptyy(String text) {
        System.out.println("|" + text + "|");
        assertTrue(stringValidator.isBlank(text));
    }
}
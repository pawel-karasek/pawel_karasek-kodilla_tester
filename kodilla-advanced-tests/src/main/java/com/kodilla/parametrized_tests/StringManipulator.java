package com.kodilla.parametrized_tests;

import java.util.Locale;

public class StringManipulator {

    public String reversWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase(Locale.ROOT);
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }
}

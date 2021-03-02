package com.kodilla.parametrized_tests;

import java.util.Locale;
import java.util.stream.Stream;

public class StringManipulator {

    public String reversWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase(Locale.ROOT);
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }

    public int countNumberOfCommas(String text) {
        int count = text.length() - text.replace(",", "").length();
        return count;
    }

}

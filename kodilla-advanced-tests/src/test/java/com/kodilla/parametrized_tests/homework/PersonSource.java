package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideUsersBMIforTests() {
        return Stream.of(
                Arguments.of(1.72, 40, "Very severely underweight"), //<15
                Arguments.of(2.03, 65, "Severely underweight"), //<16
                Arguments.of(1.65, 50, "Underweight"), //18,5
                Arguments.of(1.82, 76, "Normal (healthy weight)"), //<25
                Arguments.of(1.04, 28, "Overweight"), //<30
                Arguments.of(1.95, 125, "Obese Class I (Moderately obese)"), //<35
                Arguments.of(1.22, 55, "Obese Class II (Severely obese)"), //<40
                Arguments.of(0.8, 28, "Obese Class III (Very severely obese)"), //<45
                Arguments.of(1.57, 120, "Obese Class IV (Morbidly Obese)"), //<50
                Arguments.of(1.69, 155, "Obese Class V (Super Obese)"), //<60
                Arguments.of(1.43, 170, "Obese Class VI (Hyper Obese)") //>=60
        );
    }
}

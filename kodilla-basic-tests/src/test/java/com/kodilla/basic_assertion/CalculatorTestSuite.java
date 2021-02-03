package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int sumResult = calculator.Sum(22, 13);
        assertEquals(35, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int subResult = calculator.Sub(22, 13);
        assertEquals(9, subResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int squareResult = calculator.Square(22);
            assertEquals(484, squareResult);
        }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        int powerResult = calculator.power(2, 3);
        assertEquals(8, powerResult);

        powerResult = calculator.power(-2, 3);
        assertEquals(-8, powerResult);

        powerResult = calculator.power(2, 0);
        assertEquals(1, powerResult);
    }
}
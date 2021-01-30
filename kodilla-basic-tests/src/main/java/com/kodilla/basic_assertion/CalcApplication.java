package com.kodilla.basic_assertion;

public class CalcApplication {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int sumResult = calculator.Sum(22, 13);
        int subResult = calculator.Sub(22, 13);
        int squareResult = calculator.Square(22);

        boolean correctSum = ResultChecker.assertEquals(35, sumResult);
        if (correctSum) {
            System.out.println("Suma działa poprawnie dla liczb " + calculator.firstNumber + " i " + calculator.secondNumber);
        } else {
            System.out.println("Suma działa poprawnie dla liczb " + calculator.firstNumber + " i " + calculator.secondNumber);
        }
        boolean correctSub = ResultChecker.assertEquals(9, subResult);
        if (correctSub) {
            System.out.println("Róźnica działa poprawnie dla liczb " + calculator.firstNumber + " i " + calculator.secondNumber);
        } else {
            System.out.println("Róźnica nie działa poprawnie dla liczb \" + calculator.firstNumber + \" i \" + calculator.secondNumber");
        }
            boolean correctSquare = ResultChecker.assertEquals(484, squareResult);
            if (correctSquare) {
                System.out.println("Kwadrat liczby działa poprawnie dla liczby " + calculator.firstNumber);
            } else {
                System.out.println("Kwadrat liczby działa poprawnie dla liczby " + calculator.firstNumber);
            }
        }
    }

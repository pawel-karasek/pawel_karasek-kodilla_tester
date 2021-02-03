package com.kodilla.basic_assertion;

public class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator() {
    }

    public int Sum(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        int Summary = firstNumber + secondNumber;
        return Summary;
    }

    public int Sub(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        int Subtraction = firstNumber - secondNumber;
        return Subtraction;
    }

    public int Square(int firstNumber) {
        this.firstNumber = firstNumber;

        int SquareFirstNumber = firstNumber * firstNumber;
        return SquareFirstNumber;
    }

    public int power(int firstNumber, int n) {
        int p = 1;

        for (int i = 0; i < n; i++) {
            p = p * firstNumber;
        }
        return p;
    }
}

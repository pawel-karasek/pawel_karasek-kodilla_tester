package com.kodilla.basic_assertion;

public class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator() {
    }

    public void Sum(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        int Summary = firstNumber + secondNumber;
        System.out.println(Summary);
    }
    public void Sub(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        int Subtraction = firstNumber - secondNumber;
        System.out.println(Subtraction);
    }
}

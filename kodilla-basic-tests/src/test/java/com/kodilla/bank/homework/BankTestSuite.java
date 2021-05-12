package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class BankTestSuite {
    Bank bank;
    CashMachine cashMachine;
    CashMachine cashMachine1;
    CashMachine cashMachine2;
    CashMachine cashMachine3;

    @BeforeEach
    void setUp() {
        bank = new Bank();
        cashMachine = new CashMachine();
        cashMachine.cashInOut(55);
        cashMachine.cashInOut(125);
        cashMachine.cashInOut(-20);

        cashMachine1 = new CashMachine();
        cashMachine1.cashInOut(50);
        cashMachine1.cashInOut(100);
        cashMachine1.cashInOut(-25);

        cashMachine2 = new CashMachine();
        cashMachine2.cashInOut(50);
        cashMachine2.cashInOut(200);
        cashMachine2.cashInOut(-50);

        cashMachine3 = new CashMachine();
        cashMachine3.cashInOut(500);
        cashMachine3.cashInOut(100);
        cashMachine3.cashInOut(-250);

    }

    @Test
    public void ShouldGetAverage() {
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        double x = bank.getAveragePayOut();
        double y = bank.getAveragePayIn();
        assertEquals(-108, x);
        assertEquals(166, y);
    }

    @Test
    void shouldAddCashMachine() {
        bank.addCashMachine(cashMachine);
        Assertions.assertEquals(1, bank.cashMachines.length);
    }

    @Test
    void shouldGetBalance() {
        bank.addCashMachine(cashMachine);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        double balance = bank.getBalance();
        Assertions.assertEquals(835, balance);
    }

    @Test
    void shouldGetPayOutsCount() {
        bank.addCashMachine(cashMachine);
        bank.addCashMachine(cashMachine1);
        int count = bank.getPayOutsCount();
        Assertions.assertEquals(2, count);
    }

    @Test
    void shouldGetPayInsCount() {
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        int count = bank.getPayInsCount();
        Assertions.assertEquals(4, count);
    }

}

package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
            int[] transactions = cashMachine.getTransactions();
            assertEquals(0, transactions.length);
        }
    @Test
    public void ShouldAddTwoTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.cashInOut(50);
        cashMachine.cashInOut(100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(50, transactions[0]);
        assertEquals(100, transactions[1]);
    }
    @Test
    public void ShouldCountTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.cashInOut(50);
        cashMachine.cashInOut(100);
        cashMachine.cashInOut(-25);
        cashMachine.cashInOut(0);

        int count = cashMachine.getTransactionsCount();
        assertEquals(3, count);

        int balance = cashMachine.getBalance();
        assertEquals(125, balance);
    }
}

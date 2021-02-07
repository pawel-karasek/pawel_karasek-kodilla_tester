package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class BankTestSuite {

        @Test
        public void ShouldGetAverage() {
            CashMachine cashMachine1 = new CashMachine();
            cashMachine1.cashInOut(50);
            cashMachine1.cashInOut(100);
            cashMachine1.cashInOut(-25);

            CashMachine cashMachine2 = new CashMachine();
            cashMachine2.cashInOut(50);
            cashMachine2.cashInOut(200);
            cashMachine2.cashInOut(-50);

            CashMachine cashMachine3 = new CashMachine();
            cashMachine3.cashInOut(500);
            cashMachine3.cashInOut(100);
            cashMachine3.cashInOut(-250);

            Bank bank = new Bank();
            bank.addCashMachine(cashMachine1);
            bank.addCashMachine(cashMachine2);
            bank.addCashMachine(cashMachine3);
            double x = bank.getAveragePayOut();
            double y = bank.getAveragePayIn();
            assertEquals(-108, bank.getAveragePayOut());
            assertEquals(166, bank.getAveragePayIn());
    }
}

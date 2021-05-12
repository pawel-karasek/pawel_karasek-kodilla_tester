package com.kodilla.bank.homework;

public class Bank {
    int size = 0;
    CashMachine[] cashMachines = new CashMachine[] {};

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine newTab[] = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public double getBalance() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }

    public int getPayOutsCount() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].payOutsCount();
        }
        return sum;
    }

    public int getPayInsCount() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].payInsCount();
        }
        return sum;
    }

    public double getAveragePayOut() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].payOuts();
        }
        return sum / getPayOutsCount();
    }
    public double getAveragePayIn() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].payIns();
        }
        return sum / getPayInsCount();
    }
}

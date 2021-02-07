package com.kodilla.bank.homework;

public class CashMachine {
    private int [] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }
    public void cashInOut(int transaction) {
        if (transaction != 0) {
            this.addTransaction(transaction);
        }
    }
    public int payOutsCount() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                count++;
            }
        }
        return count;
    }
    public int payInsCount() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                count++;
            }
        }
        return count;
    }
    public int payOuts() {
    int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
        if (transactions[i] < 0) {
            sum = sum + transactions[i];
        }
    }
        return sum;
}
    public int payIns() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum = sum + transactions[i];
            }
        }
        return sum;
    }

    private void addTransaction(int transaction) {
        this.size++;
        int newTab[] = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }
    public int getTransactionsCount() {
        return transactions.length;
    }
    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum = sum + transactions[i];
        }
        return sum;
    }

    public int[] getTransactions() {
        return transactions;
    }
}

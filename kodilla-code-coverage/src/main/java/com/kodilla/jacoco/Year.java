package com.kodilla.jacoco;

public class Year {
    int testYear;

    public Year(int year) {
        this.testYear = year;
    }

    public boolean isLeap() {
        if (this.testYear % 4 == 0) {
            if (this.testYear % 100 == 0) {
                return (this.testYear % 400 == 0);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

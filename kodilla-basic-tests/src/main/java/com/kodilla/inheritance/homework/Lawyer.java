package com.kodilla.inheritance.homework;

public class Lawyer extends Job {

    public Lawyer(double salary) {
        super(salary);
        this.responsibilities = "representation in court";
    }
}

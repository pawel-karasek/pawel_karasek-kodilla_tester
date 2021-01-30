package com.kodilla.inheritance.homework;

public class Person {
    String name;
    int age;
    Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public void printPerson() {
        System.out.println(name + " is responsible for " + job.responsibilities);
    }
}

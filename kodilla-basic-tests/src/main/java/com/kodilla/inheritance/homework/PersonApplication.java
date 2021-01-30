package com.kodilla.inheritance.homework;

public class PersonApplication {
    public static void main(String[] args) {

        Job programmer = new Programmer(12000);
        Person person1 = new Person("Wojtek", 67, programmer);

        Job architect = new Architect(8000);
        Person person2 = new Person("Antek", 45, architect);

        Job doctor = new Doctor(15000);
        Person person3 = new Person("Marcin", 37, doctor);

        Job lawyer = new Lawyer(7000);
        Person person4 = new Person("Marta", 36, lawyer);

        person1.printPerson();
        person2.printPerson();
        person3.printPerson();
        person4.printPerson();

    }
}

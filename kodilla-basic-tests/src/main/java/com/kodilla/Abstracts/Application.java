package com.kodilla.Abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog(4);
        dog.giveVoice();

        Duck duck = new Duck();
        duck.giveVoice();
    }
}

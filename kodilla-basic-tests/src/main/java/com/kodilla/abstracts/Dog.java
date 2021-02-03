package com.kodilla.abstracts;

public class Dog extends Animal{
    public Dog(int numberOfLegs) {
        super(numberOfLegs = 4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");
    }
}

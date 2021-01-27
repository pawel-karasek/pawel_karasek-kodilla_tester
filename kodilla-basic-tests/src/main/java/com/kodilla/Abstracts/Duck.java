package com.kodilla.Abstracts;

public class Duck extends Animal {
    public Duck() {

        super(2);
    }

    @Override
    public void giveVoice() {
        System.out.println("Kwa kwa");
    }
}

package com.kodilla.inheritance.homework;

public class osApplication {
    public static void main(String[] args) {
        OperatingSystem linux = new Linux(1986);
        OperatingSystem windows = new Windows(1985);

        linux.turnOn();
        linux.turnOff();

        windows.turnOn();
        windows.turnOff();
    }
}

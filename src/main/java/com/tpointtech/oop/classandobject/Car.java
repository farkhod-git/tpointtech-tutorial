package com.tpointtech.oop.classandobject;

public class Car {
    public enum CarColor {
        RED,
        BLUE,
        YELLOW,
        BLACK
    }

    String name;
    double price;
    CarColor color;

    public static Car createInstance() {
        return new Car();
    }
}
package com.tpointtech.designpattern.creational.factorymethod;

public class FactoryMethod {
    private FactoryMethod() {
    }

    public static FactoryMethod getNewInstance() {
        return new FactoryMethod();
    }

    void m() {
    }

    // ...
}

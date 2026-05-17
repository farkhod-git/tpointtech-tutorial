package com.tpointtech.creationaldesignpattern.factorymethod;

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

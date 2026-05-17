package com.tpointtech.creationaldesignpattern.singleton;

public class SingletonThreadSafe1 {
    private static SingletonThreadSafe1 instance;

    private SingletonThreadSafe1() {
    }

    public static SingletonThreadSafe1 getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe1.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe1();
                }
            }
        }

        return instance;
    }

    void m() {
    }
}

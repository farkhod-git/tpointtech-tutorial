package com.tpointtech.designpattern.creational.singleton;

public class SingletonThreadSafe2 {
    private SingletonThreadSafe2() {
    }

    private static final class InstanceHolder {
        private static final SingletonThreadSafe2 instance = new SingletonThreadSafe2();
    }

    public static SingletonThreadSafe2 getInstance() {
        return InstanceHolder.instance;
    }

    void m() {
    }
}

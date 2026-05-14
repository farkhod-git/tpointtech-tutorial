package com.tpointtech.multithreading;

public class RuntimeClass {
    static void main() {
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
    }
}

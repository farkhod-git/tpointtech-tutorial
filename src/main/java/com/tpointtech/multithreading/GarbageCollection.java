package com.tpointtech.multithreading;

public class GarbageCollection {
    static void main() {
        // In Java, garbage means unreferenced objects

        // Garbage Collection is an automatic memory management process
        //    in which the JVM identifies and removes objects that are no longer in use

        System.out.println("Main thread start");

        class A {
            @Override
            protected void finalize() throws Throwable {
                System.out.println("Object dead");
            }
        }

        for (int i = 0; i < 10; i++) {
            A a = new A();
        }

        System.gc();

    }
}

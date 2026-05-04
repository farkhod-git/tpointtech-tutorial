package com.tpointtech.exceptionhandling;

import java.util.concurrent.TimeUnit;

public class FinalizeMethod {
    static void main() throws InterruptedException {
        // finalize method called by the garbage collector before an object destroyed
        extracted();

        for (int i = 0; i < 20; i++) {
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println("AAA");
    }

    private static void extracted() {
        class A {
            final int val;

            A(int val) {
                this.val = val;
            }

            @Override
            public void finalize() {
                System.out.println("A class destroyed");
            }
        }

        A a = new A(10);
        System.out.println(a);
    }
}

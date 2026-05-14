package com.tpointtech.synchronization;

public class VolatileKeyword {
    static volatile boolean stop = false;

    static void main() {

        new Thread(() -> {
            while (!stop) {
                Thread.onSpinWait();
            }
            System.out.println("Thread stopped");
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            stop = true;
            System.out.println("Stop set true");
        }).start();

    }
}

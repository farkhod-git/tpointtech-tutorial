package com.tpointtech.multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CustomThreadPoolDemo {

    static void main() {
        try (CustomThreadPool customThreadPool = new CustomThreadPool(4)) {
            for (int i = 0; i < 10; i++) {
                customThreadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + " toke work");
                    try {
                        Thread.sleep(new Random().nextInt(1, 5) * 1000L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }
    }

    public static class CustomThreadPool implements AutoCloseable {
        private volatile boolean shutdown = false;

        private final BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);

        public CustomThreadPool(int capacityOfPool) {
            Runnable runnable = () -> {
                while (!shutdown) {
                    try {
                        queue.take().run();
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
            };

            for (int i = 0; i < capacityOfPool; i++) {
                new Thread(runnable).start();
            }
        }

        public void execute(Runnable r) {
            try {
                queue.put(r);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        public void shutdown() {
            shutdown = true;
        }

        @Override
        public void close() {
            shutdown();
        }
    }

}

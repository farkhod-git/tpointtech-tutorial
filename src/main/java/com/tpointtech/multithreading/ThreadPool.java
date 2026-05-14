package com.tpointtech.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    static void main() {
        //
        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {
            Runnable runnable = () -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
            };

            for (int i = 0; i < 10; i++) {
                executorService.execute(runnable);
            }

            System.out.println(executorService);

            // This method stops the thread pool gracefully
            executorService.shutdown();

            // This method stops the thread pool immediately
            executorService.shutdownNow();
        }


        // Deadlock.
        // Deadlock can occur when all active threads are waiting for tasks that are
        //      still in the queue, and no thread is available to execute them


    }
}

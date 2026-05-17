package com.tpointtech.multithreading.synchronization.forkjoin;

public class SearchElementThreadDemo {
    static void main() {
        int[] arr = {50, 32, 61, 50, 49, 50, 16, 71, 50, 94, 10, 90, 12, 50, 78, 98, 88, 99};
        int searchElement = 50;
        Searcher searcher = new Searcher(arr, searchElement);
        int compute = searcher.compute();
        System.out.println(compute);
    }
}

class Searcher {
    int[] arr;
    int start, end, element;

    public Searcher(int[] arr, int start, int end, int element) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.element = element;
    }

    public Searcher(int[] arr, int element) {
        this(arr, 0, arr.length, element);
    }

    int compute() {
        int mid = start + (end - start) / 2;

        final int[] leftResult = {0};
        Thread t1 = new Thread(() -> {
            SearchWork left = new SearchWork(arr, start, mid, element);
            leftResult[0] = left.compute();
        });
        t1.start();

        final int[] rightResult = {0};
        Thread t2 = new Thread(() -> {
            SearchWork right = new SearchWork(arr, mid, end, element);
            rightResult[0] = right.compute();
        });
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return leftResult[0] + rightResult[0];
    }
}

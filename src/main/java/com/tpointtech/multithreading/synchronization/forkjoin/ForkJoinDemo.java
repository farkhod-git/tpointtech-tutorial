package com.tpointtech.multithreading.synchronization.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
    static void main() {

        int[] arr = {50, 32, 61, 50, 49, 50, 16, 71, 50, 94, 10, 90, 12, 50, 78, 98, 88, 99};
        int searchElement = 50;
        SearchWork searchWork = new SearchWork(arr, searchElement);

        try (ForkJoinPool fjp = ForkJoinPool.commonPool()) {
            Integer freq = fjp.invoke(searchWork);
            System.out.println(searchElement + " founds " + freq + " times");
        }

        System.out.println(SearchWork.instances);
    }
}

class SearchWork extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 3;

    public static int instances = 0;

    {
        instances++;
    }

    int[] arr;
    int start;
    int end;
    int searchElement;

    public SearchWork(int[] arr, int start, int end, int searchElement) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.searchElement = searchElement;
    }

    public SearchWork(int[] arr, int searchElement) {
        this(arr, 0, arr.length, searchElement);
    }

    @Override
    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            return countFrequencyOfElement();
        }

        int mid = start + (end - start) / 2;
        SearchWork left = new SearchWork(arr, start, mid, searchElement);
        SearchWork right = new SearchWork(arr, mid, end, searchElement);

        left.fork();

        int rightResult = right.compute();

        int leftResult = left.join();

        return leftResult + rightResult;
    }

    private int countFrequencyOfElement() {
        int count = 0;

        for (int i = start; i < end; i++) {
            if (arr[i] == searchElement) {
                count++;
            }
        }

        return count;
    }
}

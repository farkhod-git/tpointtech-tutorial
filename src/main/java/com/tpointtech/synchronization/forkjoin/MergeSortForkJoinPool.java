package com.tpointtech.synchronization.forkjoin;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MergeSortForkJoinPool {
    static void main() {

        Random random = new Random();
        int[] arr = new int[10_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000_000);
        }

        try (ForkJoinPool forkJoinPool = ForkJoinPool.commonPool()) {
            MergeSortTask task = new MergeSortTask(arr);

            long startTime = System.currentTimeMillis();
            forkJoinPool.invoke(task);
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        }

        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}

class MergeSortTask extends RecursiveAction {
    private static final int THRESHOLD = 100;
    final int[] arr;
    final int start;
    final int end;

    MergeSortTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    MergeSortTask(int[] arr) {
        this(arr, 0, arr.length);
    }

    @Override
    protected void compute() {
        if ((end - start) <= THRESHOLD) {
            Arrays.sort(arr, start, end);
            return;
        }

        int mid = start + (end - start) / 2;

        MergeSortTask t1 = new MergeSortTask(arr, start, mid);

        MergeSortTask t2 = new MergeSortTask(arr, mid, end);

        t1.fork();
        t2.compute();
        t1.join();

        int[] temp = new int[end - start];
        int i = start, j = mid, k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        if (j == end)
            System.arraycopy(arr, i, arr, start + k, mid - i);

        System.arraycopy(temp, 0, arr, start, k);
    }
}

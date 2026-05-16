package com.tpointtech.synchronization.forkjoin;

import java.util.Arrays;
import java.util.Random;

public class MergeSortSimple {
    static void main() {
        Random random = new Random();
        int[] arr = new int[10_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000_000_000);
        }

        long start = System.currentTimeMillis();
        sort(arr, 0, arr.length);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

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

    private static final int THRESHOLD = 100;

    static void sort(int[] arr, int start, int end) {
        if (end - start < THRESHOLD) {
            Arrays.sort(arr, start, end);
            return;
        }

        int mid = start + (end - start) / 2;
        sort(arr, start, mid);
        sort(arr, mid, end);

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

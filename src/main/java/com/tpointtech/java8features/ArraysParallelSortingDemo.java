package com.tpointtech.java8features;

import java.util.Arrays;

public class ArraysParallelSortingDemo {
    static void main() {
        int[] arr = {5, 2, 8, 1, 9};
        Arrays.parallelSort(arr);
        Arrays.sort(arr);
    }
}

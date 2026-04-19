package com.tpointtech.array;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        // An array is a collection of elements of the same type
        //      stored in a single, contiguous block of memory
        // An array is a data structure used the store a fixed number of elements

        // Arrays are two types,
        //      single dimensional
        //      multidimensional

        // Single dimensional array
        {

            // declaration
            int[] a = new int[4];
            a[0] = 10;
            a[1] = 30;
            a[2] = 50;
            a[3] = 80;
            // a[4] = 100; // array index out of bounds

            // traverse
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
            for (int i : a) {
                System.out.println(i);
            }
        }

        // Multidimensional array
        {
            // 2D array (two-dimensional array)
            int[][] a = new int[2][3];
            a[0][0] = 1;
            a[0][1] = 2;
            a[0][2] = 3;
            a[1][0] = 11;
            a[1][1] = 22;
            a[1][2] = 33;

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + ", ");
                }
                System.out.println();
            }

            for (int[] row : a) {
                for (int i : row) {
                    System.out.print(i + ", ");
                }
                System.out.println();
            }

            // Anonymous array
            for (int i : new int[]{1, 2, 3, 4}) {
                System.out.println(i);
            }

            // Jagger array
            // a jagged array is an array of arrays
            //   where each row of the array can have different number of columns
            int[][] jagged = {
                    {1, 2},
                    {3, 4, 5, 6},
                    {7, 8, 9}
            };

        }

        // -
        {
            int[] a = {1, 2, 3};
            Class<? extends int[]> c = a.getClass();
            String name = c.getName();
            System.out.println("NAME: " + name);

            int[][] a1 = {{1}, {2}, {3}};
            Class<? extends int[][]> c1 = a1.getClass();
            String name1 = c1.getName();
            System.out.println("NAME: " + name1);
        }

        // Copy an array
        {
            char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
            char[] b = new char[4];
            System.arraycopy(a, 1, b, 0, b.length);
            System.out.println(Arrays.toString(b));
        }

        // Cloning an array
        {
            int[] a = {1, 2, 3, 4, 5};
            int[] clone = a.clone();
            System.out.println(a);
            System.out.println(clone);
            System.out.println(Arrays.toString(clone));

            // cloning 2d (two-dimensional) array
            int[][] b = {
                    {1, 2},
                    {3, 4}
            };

            int[][] clone2 = b.clone();

            // different
            System.out.println(b);
            System.out.println(clone2);

            // but
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i] + " - " + clone2[i]); // same
            }
        }

        // Length
        {
            int[] a = {1, 2, 3, 4, 5}; // length = 5
            System.out.println(a.length);
        }
    }
}

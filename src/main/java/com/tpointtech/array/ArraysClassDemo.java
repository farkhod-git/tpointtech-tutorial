package com.tpointtech.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysClassDemo {
    public static void main(String[] args) {
        // Arrays class

        line("SORT");
        // 1 Sort
        {
            // full sort
            int[] a = {1, 2, 8, 3, 7, 6, 7, 2, 3, 8};
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));

            // sort range
            int[] b = {1, 2, 8, 3, 7, 6, 7, 2, 3, 8};
            Arrays.sort(b, 1, 5); // [fromIndex, toIndex)
            System.out.println(Arrays.toString(b));

            // parallel sort - sorting with many threads (Fork Join)
            Arrays.parallelSort(b);


            // Sort Non-Primitive type
            class Car {
                private final String name;
                private double price;

                public Car(String name, double price) {
                    this.name = name;
                    this.price = price;
                }

                Car(String name) {
                    this(name, 0.0D);
                }

                public double getPrice() {
                    return price;
                }

                public void setPrice(double price) {
                    this.price = price;
                }

                public String getName() {
                    return name;
                }

                @Override
                public String toString() {
                    return name + " - $" + price;
                }
            }

            Car[] cars = {
                    new Car("Chevrolet Corvette Stingray", 72_495),
                    new Car("Mazda MX-5 Miata", 31_665),
                    new Car("Toyota GR86", 32_595),
                    new Car("Subaru BRZ", 37_055),
                    new Car("BMW M2", 69_550),
                    new Car("Chevrolet Corvette E-Ray", 111_095)
            };

            Car[] sortedByPrices = cars.clone();
            Arrays.sort(sortedByPrices, Comparator.comparingDouble(Car::getPrice));

            System.out.println("Sorted by prices ----");
            for (Car car : sortedByPrices) {
                System.out.println(car);
            }

            Car[] sortedByNames = cars.clone();
            Arrays.sort(sortedByNames, Comparator.comparing(Car::getName));

            System.out.println("\nSorted by names ------");
            for (Car car : sortedByNames) {
                System.out.println(car);
            }
        }

        line("SEARCH");

        // 2 Search (Binary search) - only for sorted arrays
        {
            int[] a = {1, 3, 5, 6, 7, 8, 9};
            int index = Arrays.binarySearch(a, 6);
            System.out.println(index); // 3
        }

        line("COMPARISON");

        // Comparison
        {
            int[] a1 = {1, 2, 3};
            int[] a2 = {1, 2, 3};
            System.out.println(Arrays.equals(a1, a2));

            Object[] b1 = {2, "A", true};
            Object[] b2 = {2, "A", true};

            System.out.println(Arrays.deepEquals(b1, b2));

            // hash code
            int hashCodeA = Arrays.hashCode(a1);
            System.out.println(hashCodeA);

            // deep hash code
            int[][] a = {
                    {1},
                    {2, 3, 4}
            };

            // deepHashCode works recursively
            int deepHashCode = Arrays.deepHashCode(a);
            System.out.println(deepHashCode);

            // deep To String
            // it works recursively too
            String deepToString = Arrays.deepToString(a);
            System.out.println(deepToString);

            int[] c1 = {1, 2, 31, 4};
            int[] c2 = {1, 2, 9, 4};

            int compare = Arrays.compare(c1, c2);
            System.out.println(compare);

        }

        line("COPY");

        // Copy methods
        {
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            int[] copy = Arrays.copyOf(a, 4);
            System.out.println(Arrays.toString(copy));

            int[] copy1 = Arrays.copyOfRange(a, 3, 5);
            System.out.println(Arrays.toString(copy1));

            int[] a1 = {1, 2, 3, 4, 5, 6};
            int[] a2 = {0, 0, 0, 0, 0, 0};

            System.arraycopy(a1, 1, a2, 1, 3);
            System.out.println(Arrays.toString(a2));
        }

        line("FILL");

        {
            int[] a = new int[10];
            Arrays.fill(a, 99);
            System.out.println(Arrays.toString(a));

            Arrays.fill(a, 2, 5, 777);
            System.out.println(Arrays.toString(a));
        }

        line("MISMATCH");

        {
            // Finds and returns the index of the first mismatch between two arrays;
            // otherwise, returns -1 if no mismatch is found.

            int[] a = {1, 2, 3, 4, 5};
            int[] b = {1, 2, 3, 4, 5};
            int mismatch1 = Arrays.mismatch(a, b);
            System.out.println(mismatch1);

            a[2] = 99;
            int mismatch2 = Arrays.mismatch(a, b);
            System.out.println(mismatch2);
        }

        line("PARALLEL");

        {
            int[] a = {8, 7, 3, 4, 5};
            Arrays.parallelPrefix(a, (left, right) -> {
                System.out.println(left + " - " + right);
                return 3;
            });
            System.out.println(Arrays.toString(a));

            int[] b = {9, 8, 7, 6, 5, 4};
            Arrays.parallelSetAll(b, index -> b[index] * -2);
            System.out.println(Arrays.toString(b));
        }

        line("SET ALL");

        {
            int[] a = {2, 7, 3, 4, 7, 2, 3, 6};
            Arrays.setAll(a, i -> a[i] * 3);
            System.out.println(Arrays.toString(a));
        }
    }

    static void line(String title) {
        System.out.printf("\n\t%s\n%n", title);
    }

}

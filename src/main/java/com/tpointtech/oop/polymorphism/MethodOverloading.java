package com.tpointtech.oop.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {

        // Method overloading - by changing

        class Math {
            static int add(int a, int b) {
                return a + b;
            }

            static double add(double a, double b) {
                return a + b;
            }

            static double add(double a, double b, double c) {
                return a + b + c;
            }

            static void sum(int a,long b){System.out.println("a method invoked");}
            static void sum(long a,int b){System.out.println("b method invoked");}
        }

        int r = Math.add(1, 2);
        double r1 = Math.add(1D, 2);
        double r2 = Math.add(1, 2, 3.0);
        Math.sum(1L, 2);
    }
}

package com.tpointtech.l1controlstatements;

import java.util.Random;

public class ControlStatementsInJava {
    public static void main(String[] args) {
        // Java compiler executes codes from top to bottom.
        // However, Java provides statements that can be used to control the flow of java code
        // Such statements are called CONTROL FLOW STATEMENTS
        // It's one of the fundamental features of java

        // Types of Control Flow Statements
        // Java provides three types of control flow statements

        /*

         1. Decision-Making Statements
            - If statements
            - Switch statement

         2. Loop Statements
            - do while loop
            - while loop
            - for loop
            - for-each loop

         3. Jump statements
            - break statement
            - continue statement

         */


        // Java Decision-Making Statements
        {
            // As the name suggest, Decision-Making statements decide which statement to execute and when.

            // 1) If statement
            //  1 Simple If statement
            //  2 if-else statement
            //  3 if-else-if statement
            //  4 Nested if statement


            // 1.1 Simple If
            if (randomNum() % 2 == 0) {
                System.out.println("Hello");
            }

            // 1.2 if-else
            if (randomNum() % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

            // 1.3 if-else-if ladder
            int num = randomNum();
            if (num % 2 == 0) {
                System.out.println(num + " is divisible by 2");
            } else if (num % 3 == 0) {
                System.out.println(num + " is divisible by 3");
            } else if (num % 5 == 0) {
                System.out.println(num + " is divisible by 5");
            } else {
                System.out.println(num + " is divisible by " + num);
            }

            // 1.4 nested-if (inner if)

            if (num % 2 == 0) {
                System.out.println(num + " is divisible by 2");
                if (num % 3 == 0) {
                    System.out.println(num + " is divisible by 3 too");
                } else {
                    System.out.println("however, " + num + " is not divisible by 3");
                }
            }


            // 2. Switch Statement
            System.out.println("SWITCH");
            int randomNum = new Random().nextInt(10);

            switch (randomNum) {
                case 1:
                    System.out.println(randomNum + " is one");
                    break;
                case 2:
                    System.out.println(randomNum + " is two");
                    break;
                case 3:
                    System.out.println(randomNum + " is three");
                    break;
                case 4:
                    System.out.println(randomNum + " is four");
                    break;
                case 5:
                    System.out.println(randomNum + " is five");
                    break;
                default:
                    System.out.println(randomNum + " is greater than 5");
            }

            // After Java 12 we can get result from switch

            String s = switch (randomNum) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                default -> "gt five";
            };

            System.out.println(s);
        }

        // Java Loop Statements
        {
            // For Loop
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("sum of numbers from 1 to 10 is: " + sum);

            // For-Each Loop
            String[] cars = {"Ferrari", "Lamborghini", "BMW"};
            for (String car : cars) {
                System.out.println(car);
            }

            // While Loop
            while (new Random().nextInt(6) != 3) {
                System.out.println("Number is not 3");
            }

            // Do-while Loop

            do {
                System.out.println("Let's see");
            } while (new Random().nextInt(6) != 3);
            System.out.println("Stop");
        }

        // Java Jump Statements
        {
            // As the name suggest, we use break statement to break the current flow
            // However, it breaks only the inner loop (nested loop)

            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    break;
                }

                if (i == 3) {
                    continue;
                }

                System.out.println("i = " + i);
            }

            // we can use break and continue with any loop statements
            // we can use break with decision-making switch statement
        }

    }

    private static int randomNum() {
        return new Random().nextInt(100);
    }
}

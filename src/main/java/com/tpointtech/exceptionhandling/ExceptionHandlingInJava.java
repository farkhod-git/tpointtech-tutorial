package com.tpointtech.exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingInJava {
    static void main() {
        // An exception is an event that occurs during the execution
        //      of a program and disrupts the normal flow of instructions

        // Throwable - the super class of all errors and exceptions
        // Throwable.class has two subclasses:
        //      1. Exception
        //      2. Error (StackOverflowError, OutOfMemoryError)

        // There are two types of exceptions
        //      Checked exceptions:
        //          Must be either handling using try catch or declared using throws
        //      Unchecked exceptions (RuntimeException):
        //          Don't need explicit handling (NullPointerException, ...)

        // Error - system-related exceptions


        // Checked exception example
        try {
            File file = new File("file.txt");
            FileReader fr = new FileReader(file);
            System.out.println("File opened successfully");
            fr.close();
        } catch (IOException e) {
            System.out.println("An exception occurred while trying to open file: " + e.getMessage());
        }

        // Unchecked exceptions - RuntimeException
        int[] ints = new int[4];
        // ints[5] = 1; // ArrayIndexOutOfBoundsException

        // Error
        try {
            rec();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow error: " + e.getMessage());
        }

        try {
            int[] bigData = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error: " + e.getMessage());
        } finally {
            System.out.println("Finally executed");
        }
    }

    static void rec() {
        rec();
    }
}

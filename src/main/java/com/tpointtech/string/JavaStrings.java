package com.tpointtech.string;

public class JavaStrings {
    public static void main(String[] args) {
        // String is an array of characters
        // CharSequence is parent for String, StringBuilder and StringBuffer
        // String is immutable
        // StringBuilder and StringBuffer are mutable


        // There are two ways to create String object

        // new keyword
        String val1 = new String(new char[]{'t', 'p', 'o', 'i', 'n', 't'});
        // string literal
        String val2 = "tpoint";

        // Each time we create a string literal, the JVM checks a string constant pool
        // If string already exists in the pool, a reference is returned
        // s1 and s2 referenced to the same object "Welcome"
        String s1 = "Welcome";
        String s2 = "Welcome";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));


        // 1. "Hello" creates literal in the string constant pool (first object)
        // 2. new String("Hello") creates a new object in the heap (second object)
        //      it holds literal reference in it
        // s3 is the reference variable to the object in the heap
        String s3 = new String("Hello");
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode("Hello"));


        String a1 = new String("Hi");
        String a2 = new String("Hi");
        // 1. "Hi" is created in the string constant pool
        // 2. a1 new object is created in the heap,
        //      it's byte array value references byte array value of "Hi"
        // 3. a2 is similar to a1

        // intern() returns reference of a2 value ("Hi") in the string pool
        String a3 = a2.intern();

    }
}

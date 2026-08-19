package com.tpointtech.java5features.javavarargs;

public class JavaVarArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(2, 2, 4, 3, 9, 8, 7));
    }

    // a method can have only one varargs
    // and this var args must be last parameter
    static int sum(int defaultValue, int... numbers) {
        int s = defaultValue;
        for (int n : numbers)
            s += n;
        return s;
    }
}

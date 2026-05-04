package com.tpointtech.exceptionhandling;

public class ThrowsKeyword {
    static void main(String[] args) throws Exception {
        a();
    }

    static void a() throws Exception {
        int a = 10 / 0;
    }
}

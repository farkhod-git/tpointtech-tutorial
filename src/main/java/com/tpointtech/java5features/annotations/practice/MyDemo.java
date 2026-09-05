package com.tpointtech.java5features.annotations.practice;

public class MyDemo {
    static void main() {
        MyService myService = new MyProxyService();
        myService.method(1);
        myService.method(null);
    }
}

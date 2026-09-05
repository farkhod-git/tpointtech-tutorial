package com.tpointtech.java5features.annotations.practice;

public class MyServiceImpl implements MyService {
    @Override
    public void method(Integer val) {
        System.out.println("Safe value is " + val);
    }
}

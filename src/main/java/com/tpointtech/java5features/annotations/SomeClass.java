package com.tpointtech.java5features.annotations;

public class SomeClass {
    void someMethod(@MyNonNull(defaultValue = 777) Integer a) {
    }
}

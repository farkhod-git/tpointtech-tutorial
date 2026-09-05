package com.tpointtech.java5features.annotations;

public class SomeClass {
    @MyAnnotation(value = "someValue")
    void someMethod(@MyNonNull(defaultValue = 777) Integer a) {
    }
}

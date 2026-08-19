package com.tpointtech.java5features.generics;

import java.util.List;

public class GenericClass<T> {

    public void genericMethod1(T t) {
    }

    public static <K> void genericMethod2(K k) {
    }

    public <I, O> O genericMethod3(I input) {
        O output = null;
        System.out.println(input);
        return output;
    }

    public <K extends List<K>> void  genericMethod4(List<K> input) {
        System.out.println(input);
    }

    // Wildcard
    // ? - any type
    // ? extends Number - any child of number

    // ? extends <SomeClass> - Upper Bounded Wildcard
    public void genericMethod5(List<? extends Number> input) {
        System.out.println(input);
    }

    // ? - Unbounded Wildcard
    public void genericMethod6(List<?> input) {
        System.out.println(input);
    }

    // ? super <SomeClass> - Lower Bounded Wildcard
    // ? is Integer or any Superclass of Integer (Integer, Number, Comparable, Object)
    public void genericMethod7(List<? super Integer> input) {
        System.out.println(input);
    }


}

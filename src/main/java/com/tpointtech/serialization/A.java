package com.tpointtech.serialization;

import java.io.Serial;
import java.io.Serializable;

public class A implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    int field1 = 10;
    String field2 = "hello";
    boolean field3 = true;
    B b = new B();

    @Override
    public String toString() {
        return field1 + "\t" + field2 + "\t" + field3 + " b = " + b;
    }
}

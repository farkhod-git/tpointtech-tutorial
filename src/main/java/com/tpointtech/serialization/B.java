package com.tpointtech.serialization;

import java.io.Serializable;

public class B implements Serializable {
    int field1 = 11;
    String field2 = "hello1";
    boolean field3 = false;

    @Override
    public String toString() {
        return field1 + "\t" + field2 + "\t" + field3;
    }
}

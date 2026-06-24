package com.tpointtech.serialization.transientkeyword;

import java.io.Serializable;

public class User implements Serializable {
    private String name = "Alisher";
    private int age = 23;
    private boolean gender = true;
    private transient String password = "secret";

    public String toString() {
        return name + " " + age + " " + gender + " " + password;
    }
}

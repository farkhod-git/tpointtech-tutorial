package com.tpointtech.java5features.annotations.practice;

public class NotNullValidator {
    public static void validate(Object val) {
        if (val == null)
            throw new IllegalArgumentException("Value cannot be null [NotNullValidator.]");
    }
}

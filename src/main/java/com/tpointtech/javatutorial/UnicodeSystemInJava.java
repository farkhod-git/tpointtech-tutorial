package com.tpointtech.javatutorial;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class UnicodeSystemInJava {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "Unicode Sytem©";
        byte[] charset = str1.getBytes(StandardCharsets.UTF_8);
        String newstr = new String(charset, StandardCharsets.UTF_8);
        System.out.println(str1);
        System.out.println(newstr);
    }
}

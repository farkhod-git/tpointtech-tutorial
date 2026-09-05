package com.tpointtech.java8features;

import java.util.Base64;

public class Base64EncodingDecodingDemo {
    static void main() {
        // three encoder

        String str = "Hello, World!";
        byte[] encode = Base64.getEncoder().encode(str.getBytes());
        String encodeStr = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(new String(encode));
        System.out.println(encodeStr);

        String encodedUrl = Base64.getUrlEncoder().encodeToString("http://localhost:8080/login".getBytes());
        System.out.println(encodedUrl);
        System.out.println(new String(Base64.getDecoder().decode(encodedUrl)));

        System.out.println(
                Base64.getMimeEncoder()
                        .encodeToString("Hello, World!".getBytes())
        );


    }
}

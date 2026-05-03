package com.tpointtech.string;

public class StringBuilderDemo {
    static void main() {

        // StringBuilder is same with StringBuffer
        // StringBuilder is not synchronized
        StringBuilder sb = new StringBuilder();
        sb.append("abcd");
        sb.delete(1, 3);
        System.out.println(sb);


    }
}

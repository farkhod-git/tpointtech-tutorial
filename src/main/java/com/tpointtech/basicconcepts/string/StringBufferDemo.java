package com.tpointtech.basicconcepts.string;

public class StringBufferDemo {
    static void main() {
        // StringBuffer is same with StringBuilder, but StringBuffer methods are synchronized
        // they save info in byte array
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("Ali");
        sb.append('@');
        sb.append(1234);
        System.out.println(sb.capacity());

        sb.append(true);
        sb.append("_end")
                .append("_hi");

        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.insert(0, "BEGIN_");
        System.out.println(sb);

        sb.replace(3, sb.length() - 3, " *** ");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.deleteCharAt(0);
        System.out.println(sb);

    }
}

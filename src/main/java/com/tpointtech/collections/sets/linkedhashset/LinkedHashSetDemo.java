package com.tpointtech.collections.sets.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    static void main() {
        LinkedHashSet<String> set = new LinkedHashSet<>(16, 0.75f);
        set.add("AB");
        set.add("CD");
        set.add("AA");

        set.addFirst("ZZ");

        System.out.println(set);
    }
}

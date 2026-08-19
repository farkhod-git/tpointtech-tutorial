package com.tpointtech.collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {
    static void main() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(null, "null value");
        System.out.println(map);

        // ConcurrentHashMap
    }
}

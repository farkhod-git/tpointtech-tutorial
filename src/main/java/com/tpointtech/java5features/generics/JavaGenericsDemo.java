package com.tpointtech.java5features.generics;

import java.util.HashMap;
import java.util.Map;

public class JavaGenericsDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("b", "2");
        Map<Integer, Boolean> boolMap = new HashMap<>();
        boolMap.put(1,true);
        boolMap.put(2,false);

        System.out.println(map);
        System.out.println(boolMap);
    }
}

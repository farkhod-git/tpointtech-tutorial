package com.tpointtech.collections.sets.enumset;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumSetDemo {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    static void main() {
        EnumSet<Day> days = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);
        System.out.println(days.contains(Day.SUNDAY));
        System.out.println(days);
        System.out.println(EnumSet.allOf(Day.class));

        EnumMap<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MONDAY, "Monday");
        System.out.println(map);


    }
}

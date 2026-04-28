package com.tpointtech.oopmisc;

public class JavaEnum {
    public static void main(String[] args) {
        // A Java Enum is a data type that is used to define fixed set of values

        enum Direction {
            NORTH, SOUTH, EAST, WEST;
        }

        System.out.println(Direction.NORTH);

        for (Direction value : Direction.values()) {
            System.out.println(value);
        }

        enum TrafficLight {
            RED("Stop"),
            YELLOW("Ready"),
            GREEN("GO");
            private final String desc;

            TrafficLight(String desc) {
                this.desc = desc;
            }

            public String getDesc() {
                return desc;
            }
        }
    }
}

package com.tpointtech.oop.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {

        // Encapsulation is the process of wrapping data and code (methods) together
        //      into a single unit

        // We use private fields and their public setter and getter methods
        //      to achieve encapsulation

        // Encapsulation
        class Car {
            private int year;
            private String name;
            private boolean sport;

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                if (year > 1970) {
                    this.year = year;
                }
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                if (name != null && !name.isBlank()) {
                    this.name = name;
                }
            }

            public boolean isSport() {
                return sport;
            }

            public void setSport(boolean sport) {
                this.sport = sport;
            }
        }

    }
}

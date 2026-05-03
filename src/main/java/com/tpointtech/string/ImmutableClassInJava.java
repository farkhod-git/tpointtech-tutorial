package com.tpointtech.string;

public class ImmutableClassInJava {
    static void main() {
        // Immutability refers an object's state that cannot be changed once it is created
        // An immutable class is a class whose objects cannot be modified after they are created
        // String and Wrapper classes are immutable classes

        // how to create immutable class in java
        // 1. Declare the class as final
        // 2. Make all fields private and final
        // 3. Initialize fields using a constructor
        // 4. Don't provide setter methods
        // 5. Return deep copies of fields or make them immutable

        final class ImmutableClass {
            private final Integer val1;
            private final String val2;

            private ImmutableClass(final Integer val1, final String val2) {
                this.val1 = val1;
                this.val2 = val2;
            }

            public Integer getVal1() {
                return val1;
            }

            public String getVal2() {
                return val2;
            }
        }

        class MutableClass {
            private boolean val;

            public void setVal(boolean val) {
                this.val = val;
            }

            public boolean isVal() {
                return val;
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        //
        record ImmutableClass2(Integer val1, MutableClass val2, ImmutableClass val3) {
            @Override
            public MutableClass val2() {
                try {
                    return (MutableClass) val2.clone();
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

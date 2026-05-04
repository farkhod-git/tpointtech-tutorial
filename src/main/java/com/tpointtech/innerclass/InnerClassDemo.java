package com.tpointtech.innerclass;

public class InnerClassDemo {
    static void main() {
        // An inner class is a class declared inside another class or interface
        class Outer {
            private static final int val = 1;
            private String text = "This is a text";

            static class Inner {
                static int val() {
                    return val;
                }
            }

            class NonStaticInner {
                void m() {
                    System.out.println(text);
                    System.out.println("NonStaticInner m()");
                }

                void setText(String text1) {
                    text = text1;
                }
            }
        }
        System.out.println(Outer.Inner.val());

        // Non-static nested class
        // 1 Member inner class
        // 2 Anonymous inner class
        // 3 Local Inner class

        // Static nested class
        // static class defined within another class
        // It can access only static members of the outer class
    }
}

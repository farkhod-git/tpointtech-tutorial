package com.tpointtech.oop._misc.innerclass.nonstaticinnerclass;

public class InnerClassTypes {
    static void main() {

        class Outer {
            private static final int val = 10;

            static class MemberInnerClass {
            }

            void m() {
                class LocalInnerClass {
                }
            }

            static class StaticNestedClass {
                void m() {
                    System.out.println("StaticNestedClass can access only static members of outer class");
                    System.out.println(val);
                }
            }
        }

        // anonymous inner class

        abstract class AbstractClass {
            abstract void abstractMethod();
        }

        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void abstractMethod() {
                System.out.println("abstractMethod");
            }
        };

        // abstractClass object is created by anonymous class
        abstractClass.abstractMethod();

        // Nested interfaces

        interface OuterInterface {
            default void om() {
                System.out.println("OuterInterface.om");
            }

            interface NestedInterface {
                default void nm() {
                    // cannot access om()
                    System.out.println("NestedInterface.nm");
                }
            }
        }
    }
}

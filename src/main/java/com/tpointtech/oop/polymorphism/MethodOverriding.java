package com.tpointtech.oop.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        // Method overriding is to rewrite a method where in parent class in subclass
        // Method overriding supports runtime polymorphism

        {
            class A {
                protected void a() {
                    System.out.println("A class method");
                }

                final void finalMethod() {
                    System.out.println("Final method cannot be overridden");
                }

                static void staticMethod() {
                    System.out.println("A Static method");
                }
            }

            class B extends A {
                static void staticMethod() {
                    System.out.println("B Static method");
                    staticMethod();
                }
            }

            class C extends A {
                @Override
                public void a() {
                    System.out.println("C class method");
                }

                static void staticMethod() {
                    System.out.println("C Static method");
                }
            }

            B b = new B();
            b.a(); // A class method
            b.staticMethod();
            C c = new C();
            c.a(); // C class method
            c.staticMethod();

        }

        // Covariant return type in java

        class A {
            A a() {
                return new A();
            }
        }

        class B extends A {
            @Override
            B a() {
                return new B();
            }
        }

    }
}

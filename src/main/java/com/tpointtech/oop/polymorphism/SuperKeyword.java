package com.tpointtech.oop.polymorphism;

public class SuperKeyword {
    public static void main(String[] args) {
        class A {
            int val = 1;

            public A(int val) {
                this.val = val;
            }
        }

        class B extends A {
            int val = 2;

            public B(int val) {
                super(val);
                this.val = val;
            }

            void show() {
                System.out.println(this.val);
                System.out.println(super.val);
            }
        }

        class C extends B {
            int val = 3;

            public C(int val) {
                super(val);
                this.val = val;
            }

            void show() {
                System.out.println(this.val);
                System.out.println(super.val);
                super.show();
            }
        }
    }
}

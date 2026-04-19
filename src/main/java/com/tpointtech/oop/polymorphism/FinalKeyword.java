package com.tpointtech.oop.polymorphism;

public class FinalKeyword {
    public static void main(String[] args) {

        // final variable cannot be changed
        final int SPEED_LIMIT = 90;


        // Final Method - Subclasses cannot override final methods
        {
            class Animal {
                final void breathe() {
                    System.out.println("Animal is breathing...");
                }

                void sound() {
                    System.out.println("Strange sound..");
                }
            }

            class Dog extends Animal {
                @Override
                void sound() {
                    System.out.println("Woof!");
                    ;
                }
            }
        }

        // Final Class - final class cannot be inherited
        {
            class Shape {
            }

            final class Square extends Shape {
            }

            // class Square2 extends Square {} // Compile-time exception
        }

        // Blank final variable can be initialized only inside a constructor
        {
            class Student {
                int id;
                String name;
                final String PAN_CARD_NUMBER;

                Student(String panCardNumber) {
                    PAN_CARD_NUMBER = panCardNumber;
                }
            }
        }

        // Static Blank final variable can be initialized only inside a static block
        {
            class A {
                static final int data;

                static {
                    data = 10;
                }
            }
        }

        // Final parameter is a method parameter whose value cannot be changed inside the method
        {
            class A {
                void a(final int finalParameter) {
                    System.out.println(finalParameter);
                    // finalParameter = 10; // Compile-time error
                }
            }
        }

        // Final keyword helps to create immutable objects
        {
            final class MyString {
                final char[] VALUE;

                MyString(String value) {
                    VALUE = value.toCharArray();
                }
            }

            MyString myString = new MyString("Hello");
            System.out.println(myString.VALUE);
        }

        // Final fields are threadsafe
    }
}

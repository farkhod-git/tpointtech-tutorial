package com.tpointtech.oop.encapsulation;

public class AccessModifiers {

    // with variables
    public int publicVariable = 10;
    protected int protectedVariable = 11;
    int defaultVariable = 12;
    private int privateVariable = 13;

    // with methods
    public void publicMethod() {
    }

    protected void protectedMethod() {
    }

    void defaultMethod() {
    }

    private void privateMethod() {
    }


    // with classes
    public class PublicInnerClass {
    }

    protected class ProtectedInnerClass {
    }

    class DefaultInnerClass {
    }

    private class PrivateInnerClass {
    }

    public static void main(String[] args) {
        // Access modifiers used with class, method and variables
        // Access modifiers:
        //      private
        //      (default)
        //      protected
        //      public

        // Access modifiers are keywords that define the visibility and accessibility
        //      of classes, methods, constructors and variables

        // Access modifier of overridden method must be greater than or equal access modifier of method in parent class

        abstract class A {
            abstract protected void a();
        }

        class B extends A {
            @Override
            public void a() { // public >= protected

            }
        }

    }
}

class DefaultClass {

}

package com.tpointtech.oopmisc;

public class ObjectClass {
    public static void main(String[] args) {
        // The Object class is the parent class of all the classes in java by default

        Object s = "farkhod";
        Object s1 = "farkhod";
        Object n = 2;
        Object a = new int[12];
        class A {
        }
        Object o = new A();

        System.out.println(o.toString());
        int i = o.hashCode();
        System.out.println(i);

        System.out.println(s.equals(s1));
        System.out.println(s.equals(n));

        class Student implements Cloneable {
            String name;
            int age;

            public Student() {
                System.out.println("Obj Created");
            }

            // shallow copy
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return name + " - " + age;
            }
        }

        Student student = new Student();
        student.name = "Ali";
        student.age = 12;
        System.out.println(student);

        System.out.println(student.hashCode());

        try {
            Student clone = (Student) student.clone();
            System.out.println(clone);

            System.out.println(clone.hashCode());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}

package com.tpointtech.reflection;

public class ReflectionAPIDemo implements A {
    public static final int a12 = 17;
    static void main() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.tpointtech.reflection.ReflectionAPIDemo");
        System.out.println("clazz.getPackageName() = " + clazz.getPackageName());

        Class<ReflectionAPIDemo> c1 = ReflectionAPIDemo.class;
        ReflectionAPIDemo reflectionAPIDemo = c1.newInstance();
        System.out.println("reflectionAPIDemo = " + reflectionAPIDemo);

        Class<A> i = A.class;
        System.out.println("i.isInterface() = " + i.isInterface());

        Class<? extends int[]> arrC = int[].class;
        System.out.println(arrC.isInterface());
        System.out.println(arrC.isArray());

        System.out.println(arrC.isPrimitive());
        Class<? super ReflectionAPIDemo> superclass = c1.getSuperclass();
        System.out.println(superclass.getName());

        System.out.println(int.class.isPrimitive());

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {
        System.out.println("B ");
        System.out.println(1 + 2);
    }

    @Override
    public void c() {

    }
}

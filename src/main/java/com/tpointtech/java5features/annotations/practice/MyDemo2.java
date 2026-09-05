package com.tpointtech.java5features.annotations.practice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;

public class MyDemo2 {
    static void main() {

        MyService myService = new MyServiceImpl();

        MyService proxy = (MyService) Proxy.newProxyInstance(MyService.class.getClassLoader(),
                new Class[]{MyService.class},
                (_, method, methodParameterValues) -> {
                    System.out.println("Before method");

                    Parameter[] parameters = method.getParameters();
                    for (int i = 0; i < parameters.length; i++) {
                        Parameter parameter = parameters[i];

                        for (Annotation annotation : parameter.getAnnotations()) {
                            Class<? extends Annotation> type = annotation.annotationType();
                            Method m = type.getMethod("validator");
                            NotNullValidator invoke = (NotNullValidator) m.invoke(annotation);
                            invoke.validate(methodParameterValues[i]);
                        }

                    }

                    Object result = method.invoke(myService, methodParameterValues);

                    System.out.println("After method");

                    return result;
                });

        proxy.method(1);
        proxy.method(null);
    }
}

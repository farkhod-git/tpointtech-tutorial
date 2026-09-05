package com.tpointtech.java5features.annotations.practice;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyProxyService implements MyService{
    private final MyService myService = new MyServiceImpl();

    @Override
    public void method(Integer val) {

        try {
            Method method = MyService.class.getMethod("method", Integer.class);

            for (Parameter parameter : method.getParameters()) {
                NotNull annotation = parameter.getAnnotation(NotNull.class);
                if (annotation != null) {
                    if (val == null) {
                        throw new IllegalArgumentException("Value cannot be null with NotNull annotation");
                    }
                }
            }

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        myService.method(val);
    }
}

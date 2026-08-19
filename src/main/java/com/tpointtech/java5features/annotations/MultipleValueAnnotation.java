package com.tpointtech.java5features.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface MultipleValueAnnotation {
    String annotationMethod() default "default-value";

    int value() default 1;

    boolean isNew() default false;
}
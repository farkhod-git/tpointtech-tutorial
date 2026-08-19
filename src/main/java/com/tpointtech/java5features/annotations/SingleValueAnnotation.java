package com.tpointtech.java5features.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// there is only one method
@Target(ElementType.PARAMETER)
public @interface SingleValueAnnotation {
    String annotationMethod() default "default-value";
}
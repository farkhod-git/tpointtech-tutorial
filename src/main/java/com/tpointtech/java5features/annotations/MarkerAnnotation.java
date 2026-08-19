package com.tpointtech.java5features.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// no method
@Target(ElementType.FIELD) // this annotation is used field
@Retention(RetentionPolicy.RUNTIME)
public @interface MarkerAnnotation {
}
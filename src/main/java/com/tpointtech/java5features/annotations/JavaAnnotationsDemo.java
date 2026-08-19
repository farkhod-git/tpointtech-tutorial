package com.tpointtech.java5features.annotations;

import java.lang.annotation.Target;
import java.util.Calendar;
import java.util.Date;

@MultipleValueAnnotation(value = 11, annotationMethod = "Yeah", isNew = true)
public class JavaAnnotationsDemo {
    @MarkerAnnotation()
    private String a;

    public static void main(String[] args) {
        // this constructor of Date class is deprecated and it warnings
        // @SuppressWarnings("deprecation") is hide this warning
        @SuppressWarnings("deprecation")
        Date date = new Date(2026, Calendar.DECEMBER, 12);

        JavaAnnotationsDemo demo = new JavaAnnotationsDemo();
        demo.print(date);

        // There annotations are used when creating custom annotations
        // @Target, @Retention, @Inherited, @Documented


    }

    void method(@SingleValueAnnotation int parameter) {

    }

    @Deprecated(since = "9", forRemoval = true)
    public void print(Date date) {
        System.out.println(date);
    }
}

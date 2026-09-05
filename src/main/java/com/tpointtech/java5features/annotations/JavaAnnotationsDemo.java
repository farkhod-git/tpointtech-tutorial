package com.tpointtech.java5features.annotations;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@MultipleValueAnnotation(value = 11, annotationMethod = "Yeah", isNew = true)
public class JavaAnnotationsDemo {
    @MarkerAnnotation()
    private String a;

    static void main(String[] args) {
        // this constructor of Date class is deprecated, and it warnings
        // @SuppressWarnings("deprecation") is hide this warning
        @SuppressWarnings("deprecation")
        Date date = new Date(2026, Calendar.DECEMBER, 12);

        JavaAnnotationsDemo demo = new JavaAnnotationsDemo();
        demo.print(date);

        // These annotations are used when creating custom annotations
        // @Target, @Retention, @Inherited, @Documented


    }

    void method(@SingleValueAnnotation int parameter) {

    }

    @Deprecated(since = "9", forRemoval = true)
    public void print(Date date) {
        System.out.println(date);
    }
}

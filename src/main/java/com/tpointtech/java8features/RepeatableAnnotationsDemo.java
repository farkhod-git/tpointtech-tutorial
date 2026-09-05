package com.tpointtech.java8features;

import java.lang.annotation.*;

public class RepeatableAnnotationsDemo {

    @RepeatableAnnotation("Admin")
    @RepeatableAnnotation("User")
    @RepeatableAnnotation("Manager")
    void m1() {
    }

    @RepeatableAnnotations({
            @RepeatableAnnotation("Admin"),
            @RepeatableAnnotation("User"),
            @RepeatableAnnotation("Manager")
    })
    void m2() {
    }

    static void main() {



    }
}

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatableAnnotations.class)
@interface RepeatableAnnotation {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface RepeatableAnnotations {
    RepeatableAnnotation[] value();
}


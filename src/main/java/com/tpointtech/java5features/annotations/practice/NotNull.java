package com.tpointtech.java5features.annotations.practice;

import javax.xml.validation.Validator;
import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NotNull {

    Class<? extends NotNullValidator> validator() default NotNullValidator.class;

}

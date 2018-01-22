package com.ybb.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface UserAnnotation {
    String desc() default "desc";
    String name();
    int age() default 18;
}

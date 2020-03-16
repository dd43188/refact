package com.water.ifelse.after.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CalculatorAnnotation {

    /**
     * 用来表示对象的唯一id
     */
    String id();
}
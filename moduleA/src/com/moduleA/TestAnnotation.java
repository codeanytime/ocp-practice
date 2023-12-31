package com.moduleA;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface TestAnnotation {
    String name() default "";
    String value();
}

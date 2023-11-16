package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author thanhch
 * <p>
 * Date: 15/11/2023
 * <p>
 * Class: MyAnnotations
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface MyAnnotations {
    MyAnnotation[] value();
}

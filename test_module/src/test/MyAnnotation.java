package test;

import java.lang.annotation.*;

/**
 * @author thanhch
 * <p>
 * Date: 15/11/2023
 * <p>
 * Class: MyAnnotation
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
}

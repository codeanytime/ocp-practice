package test;

/**
 * @author thanhch
 * <p>
 * Date: 15/11/2023
 * <p>
 * Class: MyClass
 */
@ChildrenAnno
@MyAnnotations({@MyAnnotation, @MyAnnotation})
public class MyClass {
    @MyAnnotation
    int x;
    @MyAnnotation
    int test() {
        return 0;
    }
}

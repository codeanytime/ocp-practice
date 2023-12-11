package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 11/12/2023
 * <p>
 * Class: Q64
 */
public class Q64 {
    static <T> T get(T t) {
        return t;
    }

    public static void main(String[] args) {
        System.out.println(get("hello"));
        System.out.println(get(new B()));
        System.out.println();
    }
}

class B {

}

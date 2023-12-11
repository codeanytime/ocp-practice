package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 12/12/2023
 * <p>
 * Class: Q70
 */
public class Q70 {
    private static final <X extends Integer, Y extends Integer> void add(X x, Y y) {
        System.out.println(x.intValue() + y.intValue());
    }

    public static void main(String[] args) {
        add(10, 20);
    }
}

package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: Q10
 */
public class Q10 {
    public static void main(String[] args) throws Exception {
        try (AutoCloseable res = new MyResource()) {

        };
    }
}

class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.err.println("Close my resource");
    }
}

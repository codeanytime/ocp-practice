package working_with_array_collection;

import java.io.IOException;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: Q11
 */
public class Q11 {
    public static void main(String[] args) {
        try (MyResourceQ11 res = new MyResourceQ11();MyResource res2 = new MyResource()) {
            res.execute();
        } catch (Exception e) {
            System.out.println("Exception occur");
        }
    }
}

class MyResourceQ11 implements AutoCloseable{
    public void execute() {
        throw new RuntimeException("Execute error");

    }
    @Override
    public void close() throws IOException {
        throw new IOException("IOE in close");
    }
}

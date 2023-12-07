package working_with_array_collection;

import java.io.IOException;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: Q18
 */
public class Q18 {
    public static void main(String[] args) {
        try (Resource1 rs1 = new Resource1(); Resource2 rs2 = new Resource2()) {
            rs1.m1();
            rs2.m2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Resource1 implements AutoCloseable {
    void m1() throws Exception {
        System.out.print("A");
        throw new Exception("B");
    }

    @Override
    public void close() throws Exception {
        System.out.print("C");
    }
}

class Resource2 implements AutoCloseable {
    void m2() {
        System.out.print("D");
    }

    @Override
    public void close() throws Exception {
        System.out.print("E");
    }
}

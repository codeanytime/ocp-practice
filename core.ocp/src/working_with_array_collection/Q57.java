package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 09/12/2023
 * <p>
 * Class: Q57
 */
public class Q57 {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(100);
        System.out.println(printer);
    }
}

class Printer<String> {
    String t;
    Printer(String t) {
        this.t = t;
    }

    public java.lang.String toString() {
        return t.toString();
    }
}

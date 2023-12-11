package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 11/12/2023
 * <p>
 * Class: Q61
 */
public class Q61 {
    public static void main(String[] args) {
        PrinterQ61<String[]> printer = new PrinterQ61<>();
        System.out.println(printer);
    }
}

class PrinterQ61<T extends Cloneable> {
}

package working_with_stream;

import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q16
 */
class MyString {
    String str;
    MyString(String str) {
        this.str = str;
    }
}

public class Q16 {
    public static void main(String[] args) {
        List<MyString> list = List.of(new MyString("Y"), new MyString("E"), new MyString("S"));
        list.stream().map(s -> s).forEach(System.out::println);
    }
}

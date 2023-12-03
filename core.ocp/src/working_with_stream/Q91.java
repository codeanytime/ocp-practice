package working_with_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 04/12/2023
 * <p>
 * Class: Q91
 */
public class Q91 {
    public static void main(String[] args) {
        // TakeWhile duyet tu trai qua phai lay nhung phan tu thoa man va dung khi khong thoa man.
        // DropWhile duyet tu trai qua phai ignore nhung phan tu thoa man va tra ve
        // cac phan tu con lai khi gap phan tu khong thoa man dieu kien
        List<String> list = new ArrayList<>(Arrays.asList("abcde", "hi", "hello", "thanhch", "hehe"));
        list.stream().takeWhile(s -> s.length() > 3).forEach(System.out::println);
        list.stream().dropWhile(s -> s.length() > 3).forEach(System.out::println);
    }
}

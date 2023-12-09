package working_with_array_collection;

import java.util.Arrays;

/**
 * @author thanhch
 * <p>
 * Date: 09/12/2023
 * <p>
 * Class: Q46
 */
public class Q46 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb1.equals(sb2));

        StringBuilder[] arr1 = {new StringBuilder("hello"), new StringBuilder("java")};
        StringBuilder[] arr2 = {new StringBuilder("hello"), new StringBuilder("java")};
        System.out.println(Arrays.mismatch(arr1, arr2));
        String[] arr3 = {"hello"};
        String[] arr4 = {"hello"};
        System.out.println(Arrays.mismatch(arr3, arr4));
    }
}

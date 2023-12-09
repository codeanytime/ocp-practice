package working_with_array_collection;

import java.util.Arrays;

/**
 * @author thanhch
 * <p>
 * Date: 09/12/2023
 * <p>
 * Class: Q47
 */
public class Q47 {
    public static void main(String[] args) {
        String[] arr1 = {"OCP", "11", null};
        String[] arr2 = {"OCP", "11"};
        String[] arr3 = {null, "OCP", "11"};

        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.compare(arr2, arr3));
        System.out.println(Arrays.compare(arr3, arr2));
    }
}

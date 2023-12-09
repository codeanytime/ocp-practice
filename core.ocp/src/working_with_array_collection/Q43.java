package working_with_array_collection;

import java.util.Arrays;

/**
 * @author thanhch
 * <p>
 * Date: 09/12/2023
 * <p>
 * Class: Q43
 */
public class Q43 {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1};
        int[] arr2 = {3, 1, 4};
        int[] arr3 = {4, 0};
        int[] arr5 = {3};

        System.out.println("ARR1 compare ARR2: " + Arrays.compare(arr1, arr2));
        System.out.println("ARR1 mismatch ARR2: " + Arrays.mismatch(arr1, arr2));
        System.out.println("ARR1 compare ARR5: " + Arrays.compare(arr1, arr5));
        System.out.println("ARR5 compare ARR1: " + Arrays.compare(arr5, arr1));
    }
}

package working_with_array_collection;

import java.util.Arrays;

/**
 * @author thanhch
 * <p>
 * Date: 08/12/2023
 * <p>
 * Class: Q36
 */
public class Q36 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 1};
        int[] arr3 = {2, 3};
        int[] arr4 = {1,4};
        int[] arr7 = {1, 2, 3};

        System.out.println(Arrays.mismatch(arr1, arr2));
        System.out.println(Arrays.mismatch(arr1, arr3));
        System.out.println(Arrays.mismatch(arr2, arr4));
        System.out.println(Arrays.mismatch(arr3, arr1));

        char[] arr5 = {'T', 'A', 'L', 'L'};
        char[] arr6 = {'T', 'A', 'L', 'K'};
        System.out.println(Arrays.mismatch(arr5, arr6));
        System.out.println(Arrays.compare(arr2, arr4));
        System.out.println(Arrays.compare(arr5, arr6));
        System.out.println(Arrays.compare(arr1, arr7) + ":" + Arrays.mismatch(arr1, arr7));
    }
}

package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: Q20
 */
public class Q20 {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {'a', 'b'};
        arr1 = arr2;
        System.out.println(arr1);

        int[] arr3 = {1, 10, 100};
        char[] arr4 = {'a', 'b'};
//        arr3 = arr4; error

        Integer[] arr5 = {1, 10, 100};
//        arr5 = arr1; error
    }
}

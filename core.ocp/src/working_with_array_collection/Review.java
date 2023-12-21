package working_with_array_collection;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author thanhch
 * <p>
 * Date: 21/12/2023
 * <p>
 * Class: Review
 */
public class Review {
    public static void main(String[] args) {
        int result = Arrays.compare(new int[] {1, 2}, null);
        System.out.println(result);
        int result1 = Arrays.compare(null, new int[] {1});
        System.out.println(result1);
        int[] a = null;
        int[] b = null;
        int result2 = Arrays.compare(a, b);
        System.out.println(result2);
        int result3 = Arrays.compare(new int[] {1, 10, 5}, new int[] {1, 7});
        int mismatch = Arrays.mismatch(new int[] {1, 10, 5}, new int[] {1, 7});
        System.out.println(result3);
        System.out.println(mismatch);
        int compareStr = "ABCD".compareTo("ABCB");
        char [] arr1 = {'A'};
        char [] arr2 = {'A', 'A', 'A', 'A'};
        System.out.println(Arrays.compare(arr1, arr2));

        byte[] arr11 = { 5, 10, 15, 20 };
        byte[] arr21 = { 5, 10, 15, 17 };
        System.out.println(Arrays.compare(arr11, arr21));
        System.out.println(Arrays.equals(arr11, arr21));
//        System.out.println(Arrays.mismatch(null, new int[] {1}));
//        System.out.println(test());
        System.out.println(Boolean.valueOf(false));
        String i = null;
        switch(Optional.ofNullable(i).orElse("test")){
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            default:
                System.out.println(i);
                break;
        }
    }

    private static String[] test() {
        return null;
    }
}

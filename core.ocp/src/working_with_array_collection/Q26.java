package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 08/12/2023
 * <p>
 * Class: Q26
 */
public class Q26 {
    public static void main(String[] args) {
        short[] arr = new short[3];
        arr[1] = 1;
        arr[2] = 2;

        byte[] byteArr = new byte[3];
        byteArr[1] = 1;
        byteArr[2] = 2;

        long[] longArr = {1, 2, 3};
        longArr[1] = 'a';
        longArr[2] = 2;
        for (long i: longArr) {
            System.out.println(i);
        }

        double[] doubleArr = new double[]{1, 2, 3};
    }
}

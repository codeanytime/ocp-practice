package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 09/12/2023
 * <p>
 * Class: Q51
 */
public class Q51 {
    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (var i = 0; i < arr.length; i++) {
            for (var j = 0; j < arr[i].length; j++) {
                switch (arr[i][j]) {
                    case "2":
                    case "4":
                    case "6":
                        break;
                    default:
                        continue;
                }
                System.out.print(arr[i][j]);
            }
        }
    }
}

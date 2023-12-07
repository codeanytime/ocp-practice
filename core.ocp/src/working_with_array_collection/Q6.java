package working_with_array_collection;

import model.CustomFileResource;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: Q6
 */
public class Q6 {
    public static void main(String[] args) {
        try (CustomFileResource fileResource = new CustomFileResource()) {
            System.out.println("HELLO");
        }
    }
}

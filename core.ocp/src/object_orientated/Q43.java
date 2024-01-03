package object_orientated;

/**
 * @author thanhch
 * <p>
 * Date: 02/01/2024
 * <p>
 * Class: Q43
 */
public class Q43 {
    public static void main(String[] args) {
        double price = 9000;
        String model;
        if (price > 10000) {
            model = "Tesla model X";
        } else if (price <= 10000) {
            model = "Tesla model Y";
        } else {
            model = "Default model";
        }
        System.out.println(model);
    }
}

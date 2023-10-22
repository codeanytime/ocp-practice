package design_pattern_and_principle.interface_design;

/**
 * @author thanhch
 * <p>
 * Date: 22/10/2023
 * <p>
 * Class: Eagle
 */
public class Eagle implements Fly {
    public int getWingSpan() {
        return 15;
    }

    public static void main(String[] args) throws Exception {
        Fly eagle = new Eagle();
        System.out.println(eagle.getWingSpan());
    }
}

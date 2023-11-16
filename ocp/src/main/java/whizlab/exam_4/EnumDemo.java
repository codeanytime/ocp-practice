package whizlab.exam_4;

/**
 * @author thanhch
 * <p>
 * Date: 16/11/2023
 * <p>
 * Class: EnumDemo
 */
public enum EnumDemo {
    EMPLOYEE("100"), STAFF("50");
    String rate;

    EnumDemo(String rate) {
        this.rate = rate;
    }
}

package generic_and_collections.review;

/**
 * @author thanhch
 * <p>
 * Date: 29/10/2023
 * <p>
 * Class: Hello
 */
public class Hello<T> {
    T t;

    public Hello(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "t=" + t +
                '}';
    }
}

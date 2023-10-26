package generic_and_collections;

/**
 * @author thanhch
 * <p>
 * Date: 26/10/2023
 * <p>
 * Class: Children
 */
public class Children extends Parent {

    public Children(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Children{" +
                "name='" + super.name + '\'' +
                '}';
    }
}

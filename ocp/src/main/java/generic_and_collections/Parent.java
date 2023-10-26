package generic_and_collections;

/**
 * @author thanhch
 * <p>
 * Date: 26/10/2023
 * <p>
 * Class: Parent
 */
public class Parent extends Root {
    protected String name;

    public Parent(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                '}';
    }
}

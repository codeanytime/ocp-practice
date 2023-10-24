package design_pattern_and_principle.immutable_object_pattern;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author thanhch
 * <p>
 * Date: 24/10/2023
 * <p>
 * Class: DemoImmutableMain
 */
public class DemoImmutableMain {
    public static void main(String[] args) {
        ImmutableObject object = new ImmutableObject(1, "thanhch",
                new ArrayList<>(Collections.singletonList(new ImmutableObject.Address("Hanoi"))));
        System.out.println(object);
        object.getAddress().add(new ImmutableObject.Address("son tay"));
        System.out.println(object);
    }
}

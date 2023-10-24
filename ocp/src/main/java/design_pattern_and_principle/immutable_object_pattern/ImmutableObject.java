package design_pattern_and_principle.immutable_object_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 24/10/2023
 * <p>
 * Class: ImmutableObject
 */
public class ImmutableObject {
    private final int id;
    private final String name;
    private final List<Address> address;

    public ImmutableObject(int id, String name,List<Address> address) {
        this.id = id;
        this.name = name;
        this.address = new ArrayList<>(address);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", address:" + address +
                '}';
    }

    static class Address {
        private final String location;

        public Address(String address) {
            this.location = address;
        }

        @Override
        public String toString() {
            return "{" +
                    "location:'" + location + '\'' +
                    '}';
        }
    }
}

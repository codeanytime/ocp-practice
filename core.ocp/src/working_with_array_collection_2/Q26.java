package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 14/12/2023
 * <p>
 * Class: Q26
 */
public class Q26 {
    public static void main(String[] args) throws CloneNotSupportedException {

        ArrayList<PersonQ26> list = new ArrayList<>();
        list.add(new PersonQ26(1, "thanhch", new Address("Ha noi")));
        list.add(new PersonQ26(2, "huybn", new Address("Son tay")));

        List<PersonQ26> cloneList = (ArrayList<PersonQ26>) list.clone();
        PersonQ26 personClone = cloneList.get(1).clone();
        cloneList.get(1).address =  new Address("Bac Ninh");
        cloneList.clear();
        System.out.println(cloneList);
        System.out.println(list);
        System.out.println(personClone);
    }
}

class PersonQ26 implements Cloneable {
    Integer id;
    String name;
    Address address;

    public PersonQ26(Integer id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    protected PersonQ26 clone() throws CloneNotSupportedException {
        PersonQ26 personClone = (PersonQ26) super.clone();
        personClone.address = this.address.clone();
        return personClone;
    }

    @Override
    public String toString() {
        return "PersonQ26{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address implements Cloneable{
    String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    @Override
    public String toString() {
        return "{" +
                "address='" + address + '\'' +
                '}';
    }
}

package generic_and_collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author thanhch
 * <p>
 * Date: 26/10/2023
 * <p>
 * Class: GenericDemo
 */
public class GenericDemo {
    public static void validateTillStringType(Collection<? super String> collection){
        //Wild card with Lower bound
        // Accept collection of objects of type string or SUPER-CLASS of String
    }

    public static void validateStringTypes(Collection<? extends String> collection){
        //Wild card with Upper bound
        // Accept collection of objects of type string or SUB-CLASS of String
    }

    public static void main(String[] args) {
        validateTillStringType(new ArrayList<Object>());//OK

//      GenericsDemo.validateTillStringType(new ArrayList<Integer>());//Error

//      GenericsDemo.validateStringTypes(new ArrayList<Object>());//Error

        validateStringTypes(new ArrayList<>());//OK
    }
}

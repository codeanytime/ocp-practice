package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 15/12/2023
 * <p>
 * Class: Q34
 */
public class Q34 {
    public static void main(String[] args) {
//        List<AnimalQ34> list = new ArrayList<DogQ34>(); --> compile error
    }
}

abstract class AnimalQ34 {}

class DogQ34 extends AnimalQ34 {}

package whizlab.exam_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 14/11/2023
 * <p>
 * Class: GenericExam3
 */
public class GenericExam3 {
    public static void main(String[] args) {
        List<? super B> list1 = new ArrayList<>();
        list1.add(new C());
        list1.add(new B());

        List<? extends B> list2 = new ArrayList<>();
        C c = (C) list2.get(0);
        B b = list2.get(0);
    }
}

package whizlab.exam_3;

import java.util.Locale;

/**
 * @author thanhch
 * <p>
 * Date: 14/11/2023
 * <p>
 * Class: LocaleExam3
 */
public class LocaleExam3 {
    public static void main(String[] args) {
        Locale locale1 = Locale.US;
        Locale locale2 = new Locale("en", "US");
        System.out.println(locale2.equals(locale1));
        Locale locale3 = new Locale.Builder().setRegion("US").build();
        System.out.println(locale3);
//        int i,j;
//        for (i = j = 0; ; ++i, j--) {
//
//        }
        int a, b, c;
        a = b = 0;
        a = c = 10;
        System.out.println(a + " " + b);
        System.out.println(test(5));
    }

    public static int test(int c) {
        int d = 0;
        return d = c;
    }
}

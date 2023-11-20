package locale;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author thanhch
 * <p>
 * Date: 19/11/2023
 * <p>
 * Class: LocaleDemo
 */
public class LocaleDemo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr", "FR"));
//        var rb = ResourceBundle.getBundle("Snacks", new Locale("US"));
//        System.out.println(rb.getString("name"));
        Locale locale = new Locale("US");
        System.out.println(locale.getCountry());
        System.out.println(locale.getLanguage());
        var locale2 = new Locale("it", "IT");
        System.out.println(locale2);
        System.out.println(locale2.getDisplayCountry(Locale.CHINA));
        System.out.println(locale2.getDisplayLanguage());
        locale2.setDefault(locale2);
        System.out.println(Locale.getDefault());

        Locale locale3 = Locale.ENGLISH;
        System.out.println(locale3.getLanguage());
    }
}

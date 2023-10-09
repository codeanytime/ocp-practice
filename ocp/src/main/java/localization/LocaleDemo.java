package localization;

import java.util.Locale;

/**
 * @author thanhch
 * <p>
 * Date: 09/10/2023
 * <p>
 * Class: LocaleDemo
 */
public class LocaleDemo {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        // setLanguage | setRegion may throw IllformedLocaleException
        Locale locale1 = new Locale.Builder()
                .setLanguage("vi")
                .setRegion("VN")
                .build();
        System.out.println(locale1.getCountry());
        System.out.println(locale1.getLanguage());

        Locale locale2 = Locale.JAPAN;
        System.out.println(locale2.getLanguage());
        System.out.println(locale2.getCountry());
    }
}

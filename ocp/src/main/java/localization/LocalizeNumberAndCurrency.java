package localization;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author thanhch
 * <p>
 * Date: 09/10/2023
 * <p>
 * Class: LocalizeNumberAndCurrency
 */
public class LocalizeNumberAndCurrency {
    public static void main(String[] args) {
        double d = 27_000.22;
        System.out.println(d);
        System.out.println(NumberFormat.getNumberInstance(Locale.ENGLISH).format(d));
        System.out.println(NumberFormat.getNumberInstance(Locale.US).format(d));
        System.out.println(NumberFormat.getNumberInstance(Locale.CHINA).format(d));
        System.out.println(NumberFormat.getNumberInstance(Locale.FRANCE).format(d));

        System.out.println(NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(d));
    }
}

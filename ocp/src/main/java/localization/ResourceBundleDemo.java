package localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author thanhch
 * <p>
 * Date: 09/10/2023
 * <p>
 * Class: ResourceBundleDemo
 */
public class ResourceBundleDemo {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder()
                .setLanguage("vi")
                .setRegion("VN").build();
        System.out.println(locale);

//        Locale locale = new Locale("vi");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
        System.out.println(resourceBundle.getString("name"));
        System.out.println(resourceBundle.getString("age"));
    }
}

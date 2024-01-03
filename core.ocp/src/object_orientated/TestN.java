package object_orientated;

import java.io.File;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author thanhch
 * <p>
 * Date: 09/01/2024
 * <p>
 * Class: TestN
 */
public class TestN {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        date.minusDays(1);
        date.minusDays(1);
        System.out.println(date);
        Calendar cal = Calendar.getInstance();
        cal.set(2024, 0, 17);
        cal.get(Calendar.MONTH);
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getTime());
        System.out.println(String.valueOf(0000));
        String formattedNumber = String.format("%04d", 1);
        System.out.println(formattedNumber);

    }
}

package object_oriented_2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author thanhch
 * <p>
 * Date: 18/02/2024
 * <p>
 * Class: DateTimeEx
 */
public class DateTimeEx {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        String dateString = "31-12-2014 18:09 +05:30";
//        DateTimeFormatter japanDate = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.JAPANESE);
//        System.out.println(date.format(japanDate));
//
//        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateString, formatter);
//        System.out.println(zonedDateTime);

        String dateString = "31-12-2014 18:09 +05:30";
        System.out.println(ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm XXX").withZone(ZoneId.systemDefault());
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateString, formatter);
        System.out.println(zonedDateTime);
    }
}

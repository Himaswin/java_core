package Feb28;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {
        Date date = new Date();
        Instant instant = Instant.now();
        System.out.println(instant.atZone(ZoneId.systemDefault()));
//        System.out.println("date= " + instant);

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2026, 02, 28);
        System.out.println(localDate1);
        localDate1 = localDate1.plusDays(20);
        System.out.println(localDate1);


        System.out.println(localDate.compareTo(localDate1));
    }
}

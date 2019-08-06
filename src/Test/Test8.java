package Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Test8 {
    public static void main(String[] args) {
      /*  LocalDate date = LocalDate.now();
        System.out.println("date = " + date);
        System.out.println(date.toEpochDay());
        LocalDate date4=LocalDate.now().plusDays(10);
        System.out.println("date4 = " + date4);
        System.out.println("date4.toEpochDay() = " + date4.toEpochDay());
        int b = (int)( date4.toEpochDay()-date.toEpochDay());
        System.out.println("b = " + b);
        System.out.println("date4.compareTo(date) = " + date4.compareTo(date));
       */

      /*  LocalDate today = LocalDate.parse("2019-08-02");
        LocalDate yesterday = LocalDate.parse("2018-08-01");
        boolean before = yesterday.isAfter(today);
        System.out.println("before = " + before);*/
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime localDateTime = LocalDateTime.now().plusDays(1).plusHours(3);
        System.out.println("localDateTime = " + localDateTime);
        Duration between = Duration.between(localDateTime, now);
        System.out.println("between = " + between);
        long l = System.currentTimeMillis();

    }
}

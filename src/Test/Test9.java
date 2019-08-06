package Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Test9 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println("instance = " + instance);
       /* Date time = instance.getTime();
        System.out.println("time = " + time);*/
        instance.setTime(new Date());
        System.out.println("instance = " + instance);
        int i = (instance.get(Calendar.MONTH))+1;
        System.out.println("i = " + i);
        System.out.println("instance.get(Calendar.YEAR) = " + instance.get(Calendar.YEAR));


    }
}

package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e) ) {
                result.add(e);

            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Apple> appleList1 = Arrays.asList(
                new Apple("green", 100),
                new Apple("red", 120),
                new Apple("orange", 90),
                new Apple("green", 20)
        );
        List<Apple> appleList=filter(appleList1,(Apple apple)->"green".equals(apple.getColor()));
        System.out.println("appleList = " + appleList);

    }
}

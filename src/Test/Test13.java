package Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Test13 {
    public static <T> List<T> filter(List<T> list,Predicate<T> p){
        List<T> results=new ArrayList<>();
        for (T s:list) {
           if(p.test(s)){
               results.add(s);

           }
        }
        return results;

    }

    public static List<Apple> map(List<Integer> list, Function<Integer,Apple> p){
        List<Apple> results=new ArrayList<>();
        for (Integer s:list) {
            results.add(p.apply(s));

            }
        return results;


    }

    public static void main(String[] args) {
     /*   List<String > list1=new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        list1.add("");
        List<String> filter = filter(list1, (String s) -> !s.isEmpty());
        System.out.println("filter = " + filter);*/
       /* int i=10;
        Runnable runnable = () -> System.out.println(i);
        i=11;*/
    /*   List<Integer> weights= Arrays.asList(1,2,3,4);
        List<Apple> map = map(weights, Apple::new);
        System.out.println("map = " + map);
        List<Integer> list3=Arrays.asList(1,2,3,4);
        String collect = list3.stream().map(Object::toString).collect(Collectors.joining(","));
        System.out.println("collect = " + collect);*/
        /*String s="a,b,c,d";
        String[] str=s.split(",");
        for (String a:str) {
            System.out.print(a+"\t");
        }*/
        List<Apple> inventory=new ArrayList<>();
        inventory.add(new Apple("green",100));
        inventory.add(new Apple("red",100));
        inventory.add(new Apple("red",120));
        inventory.add(new Apple("orange",130));
        inventory.add(new Apple("green",80));
        inventory.add(new Apple("red",200));
        inventory.add(new Apple("orange",150));
        //inventory.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        //Map<String, List<Apple>> collect = inventory.stream().collect(groupingBy(Apple::getColor));
        Map<Integer, List<Apple>> collect = inventory.stream().collect(groupingBy(Apple::getWeight));
        System.out.println("collect = " + collect);


    }
}

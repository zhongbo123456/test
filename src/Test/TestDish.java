package Test;

import jdk.nashorn.internal.runtime.JSONListAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @version V1.0
 * @ClassName: Test.TestDish.java
 * @Description: stream流测试
 * @author: zhongbo
 * @date: 2019-08-09 14:58
 */
public class TestDish {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
        /**
         * 查询热量最高的三道菜的菜名
         */
        //List<String> collect = menu.stream().filter(dish -> dish.getCalories() > 300).map(Dish::getName).limit(3).collect(Collectors.toList());
        //System.out.println("collect = " + collect);
        /**
         * 流只遍历一次
         */
     /*   Stream<Dish> stream = menu.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);
*/
        /**
         * foreach循环外部迭代
         */
  /*      List<String> names=new ArrayList<>();
        for (Dish d:menu) {
            names.add(d.getName());
        }
        System.out.println("names = " + names);
    */
        /**
         * 迭代器外面迭代
         */
/*    List<String> names1=new ArrayList<>();
        Iterator<Dish> iterator = menu.iterator();
        while (iterator.hasNext()){
            Dish dish = iterator.next();
            names1.add(dish.getName());
        }
        System.out.println("names1 = " + names1);
    */
        /**
         * 流内部迭代
         */
       /* List<String> collect = menu.stream().map(Dish::getName).collect(Collectors.toList());
        System.out.println("collect = " + collect);*/
        /**
         * 打印流操作
         */
   /*     List<String> collect = menu.stream().filter(dish -> {
            System.out.println("filtering:" + dish.getName());
            return dish.getCalories() > 300;
        }).map(dish -> {
            System.out.println("mapping:" + dish.getName());
            return dish.getName();
        }).limit(3).collect(Collectors.toList());
        System.out.println("collect = " + collect);*/
        /**
         * 返回void的终端操作
         */
        /*  menu.stream().forEach(System.out::println);*/
        /**
         * 返回long的终端操作
         */
       /* long count = menu.stream().filter(dish -> dish.getCalories() > 300).distinct().limit(3).count();
        System.out.println("count = " + count);*/

        /**
         * 外部迭代选择素菜
         */
      /*  List<Dish> list=new ArrayList<>();
        for (Dish d:menu) {
            if(d.isVegetarian()){
                list.add(d);
            }
        }
        System.out.println("list = " + list);
*/
        /**
         * 流内部迭代选择素菜
         */
     /*   List<Dish> collect = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
        System.out.println("collect = " + collect);
*/
        /**
         * distinct()使用
         */
    /* List<Integer> list=Arrays.asList(1,2,3,2,4);
       list.stream().filter(integer -> integer % 2 == 0).distinct().forEach(System.out::println);
       */

        /**
         *skip()使用
         */
       /* List<Dish> collect = menu.stream().filter(dish -> dish.getCalories() > 300).skip(2).collect(Collectors.toList());
        System.out.println("collect = " + collect);
*/
        /**
         * 筛选前两个荤菜
         */
        /*List<Dish> collect = menu.stream().filter(dish -> dish.isVegetarian() == false).limit(2).collect(Collectors.toList());
        System.out.println("collect = " + collect);*/
        /**
         * flatMap()使用
         *  flatMap与map的区别在于 flatMap是将一个流中的每个值都转成一个个流，然后再将这些流扁平化成为一个流
         */

        List<String> list = Arrays.asList("好,好,学", "习,天,天", "向,上");
        List<String[]> collect = list.stream().map(str -> str.split(",")).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        List<String> collect1 = list.stream().map(str -> str.split(",")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);

        /**
         * flatMap()使用，返回数对
         */
       /* List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);
        List<int[]> collect = number1.stream().flatMap(
                i -> number2.stream()
                        .map(j -> new int[]{i, j})
        ).collect(Collectors.toList());
        System.out.println("collect = " + collect);*/
        /**
         * 返回总和被3整除的数对
         */
      /*  List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);
        List<int[]> collect1 = number1.stream().flatMap(
                i -> number2.stream()
                        .filter(j->(i+j)%3==0)
                        .map(j -> new int[]{i, j})
        ).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
*/

    }
}

package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple) ) {
                result.add(apple);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> list=new ArrayList<>();
        list.add(new Apple("red",160));
        list.add(new Apple("red",80));
        list.add(new Apple("red",90));
        list.add(new Apple("green",120));
        list.add(new Apple("green",50));
        list.add(new Apple("green",170));
        list.add(new Apple("orange",130));
        list.add(new Apple("orange",180));
       // List<Apple> list1 = filterApples(list,new AppleColorAndWeigitPredicate());
        //匿名类，声明时并实例化
       /* List<Apple> list1 = filterApples(list, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "orange".equals(apple.getColor());
            }
        });*/
       //Lambda表达式
        List<Apple> list1 = filterApples(list, (Apple apple) -> "red".equals(apple.getColor()));
        System.out.println("list1 = " + list1);
    /*    for (Apple apple:list) {
            if ("red".equals(apple.getColor())&&apple.getWeight()>80){
                result.add(apple);
            }
        }
        result=list.stream().filter(apple -> "green".equals(apple.getColor())).collect(Collectors.toList());
        System.out.println("result = " + result);*/
    }
}

package Test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String [] args){
        List<String> list=new ArrayList<>();
        list.add("周1");
        list.add("周2");
        list.add("周3");
        list.add("周芷若");
        list.add("张无忌");
        list.add("熊大");
        list.add("熊二");
        list.stream()
                .filter(a->a.startsWith("周"))
                .forEach(a->System.out.println(a));
    }
}

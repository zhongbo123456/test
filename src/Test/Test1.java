package Test;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
 public static void main(String [] args){
     Map<String,String> map=new HashMap<>();
     map.put("one","张三");
     map.put("two","李四");
     map.put("three","王五");
     map.put("oo","asdfjl");


     //键遍历,使用foreach
    /* Set<String> set = map.keySet();
     for (String s:set) {
         System.out.println(s);
     }*/
    //值遍历，使用foreach
     /*Collection<String> values = map.values();
     for (String s:values) {
         System.out.println(s);
     }*/
     //键值对遍历，使用foreach
 /*    Set<Map.Entry<String, String>> entries = map.entrySet();
     for (Map.Entry<String, String> m:entries) {
         System.out.print(m.getKey()+"\t");
         System.out.println(m.getValue());
     }*/
      //键值对遍历，使用stream流
     List<String> collect = map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
     System.out.println("collect = " + collect);


 }

}

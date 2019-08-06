package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @ClassName: Test.Test7.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-07-31 17:37
 * @version V1.0
 */
public class Test7 {
    public static void main(String[] args) {
        List<Person> person = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 27),
                new Person("lawrence", 33)
        );
        List<Person1> s=new ArrayList<>();
        /**
         * 方法一foreach
         */
       /* for (Person p:person) {
            s.add(p.getName());
        }*/
        /**
         * 方法二
         */
       person.stream().map(person1 -> person1.getName()).map(Person1::new).forEach(s::add);
        System.out.println("s = " + s);
        /**
         * 方法三
         */
      /*  List<String> collect = person.stream().map(person1 -> person1.getName()).collect(Collectors.toList());
        System.out.println("collect = " + collect);*/
    }


}

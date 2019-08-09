package Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * @version V1.0
 * @ClassName: Test.Test12.java
 * @Description: parallelStream()和stream()
 * @author: zhongbo
 * @date: 2019-08-07 17:22
 */
public class Test12 {
    public static void main(String[] args) {
        //List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6");
        //list.stream().forEach(System.out::println);
        //list.parallelStream().forEach(System.out::println);
        //list.parallelStream().forEachOrdered(System.out::println);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        Lock lock = new ReentrantLock();

        IntStream.range(0, 10000).forEach(list1::add);

        IntStream.range(0, 10000).parallel().forEach(list2::add);

        IntStream.range(0, 10000).forEach(i -> {
            lock.lock();
            try {
                list3.add(i);
            } finally {
                lock.unlock();
            }
        });

        System.out.println("串行执行的大小：" + list1.size());
        System.out.println("并行执行的大小：" + list2.size());
        System.out.println("加锁并行执行的大小：" + list3.size());
    }
}

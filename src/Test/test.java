package Test;


import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        StringBuilder couponName = new StringBuilder();
            list.forEach(integer -> {
                String name = "优惠券" + integer;
                couponName.append(name).append(",");
            });
        if (couponName.length() > 0) {
            couponName.deleteCharAt(couponName.length() - 1);
        }
        String couponName1=couponName.toString();

        if(couponName1!=null){
            System.out.println("你使用的“"+couponName1+"”已退还");
        }else {
            System.out.println("联系客服");
        }



    }
}




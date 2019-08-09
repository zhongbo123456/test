package Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {

        List<List<String>> models= Arrays.asList(
                Collections.emptyList(),
                Arrays.asList("单独脱水", "快速洗涤", "标准洗涤", "大件洗涤"),
                Arrays.asList("晾干", "轻柔", "标准", "强力"),
                Arrays.asList("五分钟", "十分钟", "十五分钟", "二十分钟"),
                Arrays.asList("标准洗涤", "???", "???", "???"),
                Arrays.asList("标准烘干", "???", "???", "???"),
                Arrays.asList("三分钟", "五分钟", "十分钟", "十五分钟"),
                Arrays.asList("???", "???", "标准", "???")
        );
        System.out.println("models = " + models);
        String modelName="支付完成";
        modelName = models.get(1).get(2-1);
        System.out.println("modelName = " + modelName);

        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = df.format(new Date());
        System.out.println("format = " + format);
    }
}

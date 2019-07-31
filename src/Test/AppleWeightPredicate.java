package Test;
/**
 * @Title:
 * @ClassName: Test.AppleWeightPredicate.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-07-26 16:12
 * @version V1.0
 */
public class AppleWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}

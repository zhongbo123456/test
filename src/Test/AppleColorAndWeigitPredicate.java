package Test;
/**
 * @ClassName: Test.AppleColorAndWeigitPredicate.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-07-31 17:27
 * @version V1.0
 */
public class AppleColorAndWeigitPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>100&&"green".equals(apple.getColor());
    }
}

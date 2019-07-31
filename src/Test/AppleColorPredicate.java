package Test;

/**
 * @Title:
 * @ClassName: Test.AppleColorPredicate.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-07-26 16:08
 * @version V1.0
 */
public class AppleColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>100;
    }
}

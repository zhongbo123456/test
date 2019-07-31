package Test;

public class AppleColorAndWeigitPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>100&&"green".equals(apple.getColor());
    }
}

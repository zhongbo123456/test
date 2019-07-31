package Test;

/**
 * @author Administrator
 */
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    default int a(int number){
        return 2;
    }
}

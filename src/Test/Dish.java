package Test;



/**
 * @ClassName: Test.Dish.java
 * @Description: 菜类
 * @author: zhongbo
 * @date:  2019-08-09 14:41
 * @version V1.0
 */

public class Dish {
    /**
     * 名字
     */
    private final String name;
    /**
     * 是否素菜
     */
    private final boolean vegetarian;
    /**
     * 卡路里
     */
    private final int calories;
    /**
     * 类型
     */
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }

    public enum Type {MEAT,FISH,OTHER}
}

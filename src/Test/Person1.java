package Test;
/**
 * @ClassName: Test.Person1.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-07-31 13:46
 * @version V1.0
 */
public class Person1 {
    /**
     * 名字
     */
    private String name;

    public Person1() {
    }

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                '}';
    }
}

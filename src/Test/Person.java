package Test;
/**
 * @ClassName: Test.Person.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-07-31 11:20
 * @version V1.0
 */
public class Person {
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

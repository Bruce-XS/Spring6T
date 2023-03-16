package cn.bruce.spring6.dao;

/**
 * GFKDXS
 *
 * @version 1.0
 * @ClassName: User
 * @Description: user info
 * @author: Bruce Xiao
 * @date: 2023-03-15
 */
public class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

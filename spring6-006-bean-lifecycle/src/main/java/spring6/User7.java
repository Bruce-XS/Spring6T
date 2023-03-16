package spring6;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: User
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class User7 {

    private String name;

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值");
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User7() {
        System.out.println("第一步：无参构造方法xxx");
    }

    //自己写 自己配 这个方法
    public void initBean(){
        System.out.println("第四步：初始化 bean");
    }

    //自己写 自己配 这个方法
    public void destroyBean(){
        System.out.println("第七步：销毁 bean");
    }
}

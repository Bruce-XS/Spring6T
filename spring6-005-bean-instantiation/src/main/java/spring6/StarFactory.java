package spring6;

/**
 * GFKDXS
 *简单工厂模式种的工厂类角色
 * @version 1.0
 * @Description:
 * @ClassName: StarFactory
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class StarFactory {

    public static Star get(){
        return new Star();
    }

}

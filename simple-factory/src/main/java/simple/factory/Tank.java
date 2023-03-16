package simple.factory;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: Tank
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class Tank extends Weapon{

    @Override
    public void attack() {
        System.out.println("坦克开炮！！");
    }
}

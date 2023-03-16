package factory;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: Fighter
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class Fighter extends Weapon{

    @Override
    public void attack() {
        System.out.println("战斗机下蛋！！！");
    }
}

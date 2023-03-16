package factory;

/**
 * GFKDXS 客户端程序
 *
 * @version 1.0
 * @Description:
 * @ClassName: Test
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class Test {

    public static void main(String[] args) {

        WeanponFactory weanponFactory = new FighterFactory();
        Weapon weapon = weanponFactory.get();
        weapon.attack();


        WeanponFactory weanponFactory2 = new TankFactory();
        Weapon weapon1 = weanponFactory2.get();
        weapon1.attack();

    }

}

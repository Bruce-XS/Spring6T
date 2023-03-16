package simple.factory;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: WeaponFactory
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class WeaponFactory {

    public static Weapon get(String weaponTpye){
        if ("Tank".equals(weaponTpye)) {
            return new Tank();
        }else if ("Fighter".equals(weaponTpye)){
            return new Fighter();
        }else {
            throw new RuntimeException("不支持该武器的生产！");
        }
    }

}

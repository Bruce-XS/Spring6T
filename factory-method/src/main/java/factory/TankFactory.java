package factory;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: TankFactory
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class TankFactory extends WeanponFactory{


    @Override
    public Weapon get() {
        return new Tank();
    }
}

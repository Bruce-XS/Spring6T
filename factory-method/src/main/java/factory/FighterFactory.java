package factory;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: FighterFactory
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class FighterFactory extends WeanponFactory{

    @Override
    public Weapon get() {
        return new Fighter();
    }
}

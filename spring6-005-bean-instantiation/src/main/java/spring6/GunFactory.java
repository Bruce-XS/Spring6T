package spring6;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: GunFactory
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class GunFactory {

    //工厂方法模式中的方法  —— 实例方法
    public Gun get(){
        return new Gun();
    }


}

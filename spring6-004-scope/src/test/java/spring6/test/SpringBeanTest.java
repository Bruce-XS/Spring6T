package spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring6.SpringBean;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: SpringBeanTest
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class SpringBeanTest {

    /**
     * 1. Spring默认情况下是如何管理这个Bean的:
     * 默认情况下Bean是单例的。(单例: singleton)在Spring上下文初始化的时候实例化。
     * 每一次调用getBean()方法的时候，都返回那个单例的对象。
     * 2.当将bean 的scope属性设置为prototype :
     * bean是多例的。
     * spring上下文初始化的时候，并不会初始化这些:prototypewyueuo每一次调用getBean()方法的时候，实例化该bean对象。
     * prototype翻译为:原型。
     */
    @Test
    public void testScope() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean sb = app.getBean("sb", SpringBean.class);
        System.out.println(sb);
        SpringBean sb1 = app.getBean("sb", SpringBean.class);
        System.out.println(sb1);
        SpringBean sb2 = app.getBean("sb", SpringBean.class);
        System.out.println(sb2);

    }


    @Test
    public void testThread() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean sb = app.getBean("sb", SpringBean.class);
        System.out.println(sb);
        SpringBean sb1 = app.getBean("sb", SpringBean.class);
        System.out.println(sb1);
        SpringBean sb2 = app.getBean("sb", SpringBean.class);
        System.out.println(sb2);

        //启动一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean sb3 = app.getBean("sb", SpringBean.class);
                System.out.println(sb3);
                SpringBean sb4 = app.getBean("sb", SpringBean.class);
                System.out.println(sb4);
            }
        }).start();

    }

}

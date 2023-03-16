package spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring6.User;
import spring6.User10;
import spring6.User7;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: LifeCycleBeanTest
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class LifeCycleBeanTest {

    @Test
    public void testLifeCycleBean(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        User user = app.getBean("user", User.class);
        System.out.println("第四步:  使用bean" + user);
        //注意：需要手动关闭spring容器 这样才会销毁bean
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) app;
        context.close();

    }

    @Test
    public void testLifeCycleBeanSeven(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        User7 user = app.getBean("user", User7.class);
        System.out.println("第六步:  使用bean" + user);
        //注意：需要手动关闭spring容器 这样才会销毁bean
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) app;
        context.close();

    }

    @Test
    public void testLifeCycleBeanTen(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        User10 user = app.getBean("user", User10.class);
        System.out.println("第八步:  使用bean" + user);
        //注意：需要手动关闭spring容器 这样才会销毁bean
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) app;
        context.close();

    }

}

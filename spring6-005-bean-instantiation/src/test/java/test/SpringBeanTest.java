package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring6.*;

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

     */
    @Test
    public void testInit() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        SpringBean sb = app.getBean("sb", SpringBean.class);
        System.out.println(sb);

    }

    @Test
    public void testFa() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        Star startBean = app.getBean("startBean", Star.class);
        System.out.println(startBean);

    }

    @Test
    public void testGun() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        Person startBean = app.getBean("pf", Person.class);
        System.out.println(startBean);

    }


    @Test
    public void testData() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        Student startBean = app.getBean("stu", Student.class);
        System.out.println(startBean);

    }


}

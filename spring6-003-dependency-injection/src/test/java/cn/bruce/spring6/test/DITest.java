package cn.bruce.spring6.test;

import cn.bruce.spring6.dao.User;
import cn.bruce.spring6.jdbc.MyDataSource;
import cn.bruce.spring6.jdbc.MyDataSource2;
import cn.bruce.spring6.jdbc.MyDataSource3;
import cn.bruce.spring6.service.OrderService;
import cn.bruce.spring6.service.OrderService2;
import cn.bruce.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * GFKDXS
 *
 * @version 1.0
 * @ClassName: DITest
 * @Description: DI Test
 * @author: Bruce Xiao
 * @date: 2023-03-15
 */
public class DITest {

    /**
     * 当引入外部的配置文件时  driver等前面都加上jdbc
     * MyDataSource{url='jdbc:mysql://localhost:3306/spring6', username='Bruce Xiao', password='12345', driver='cm.mysql.cj.jdbc.Driver'}
     * 不然username 结果是 操作系统的用户
     */
    @Test
    public void testOutFile(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        MyDataSource myDataSource = app.getBean("ds", MyDataSource.class);
        System.out.println(myDataSource);

    }

    @Test
    public void testAutoWireByType(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-autowrire.xml");
        OrderService orderService = app.getBean("or", OrderService.class);
        orderService.getData();

    }

    @Test
    public void testAutoWireByName(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-autowrire.xml");
        OrderService2 orderService = app.getBean("orderService", OrderService2.class);
        orderService.getData();

    }

    @Test
    public void testUitl(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource2 ds1 = app.getBean("ds1", MyDataSource2.class);
        System.out.println(ds1);
        MyDataSource3 ds2 = app.getBean("ds2", MyDataSource3.class);
        System.out.println(ds2);
    }

    @Test
    public void testDI() {

        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");

        UserService userService = app.getBean("userServiceBean", UserService.class);
        userService.saveUser();
    }


    @Test
    public void testCutDI() {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        OrderService orderService = app.getBean("orderServiceBean", OrderService.class);
        orderService.getData();
        OrderService orderService2 = app.getBean("orderServiceBean2", OrderService.class);
        orderService2.getData();
        OrderService orderService3 = app.getBean("orderServiceBean3", OrderService.class);
        orderService3.getData();
    }

    @Test
    public void testDI2() {

        ApplicationContext app = new ClassPathXmlApplicationContext("set-di.xml");

        User user = app.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void testMyData() {
        ApplicationContext app = new ClassPathXmlApplicationContext("jdbc.xml");
        MyDataSource myDataSource = app.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }
}

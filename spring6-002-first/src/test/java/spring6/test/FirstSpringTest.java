package spring6.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * GFKDXS
 *
 * @version 1.0
 * @ClassName: FirstSpringTest
 * @Description: 测试spring6 bean
 * @author: Bruce Xiao
 * @date: 2023-03-15
 */
public class FirstSpringTest {

    @Test
    public void testF(){
        //1获取spring对象
        /*
        / ApplicationContext翻译为:应用上下文。其实就是Spring容器。// ApplicationContext是一个接口。
        / ApplicationContext接口下有很多实现类。其中有一个实现类叫做:ClassPathXmlApplicationContext
        // ClassPathXmlApplicationContext专门从类路径当中加载spring配置文件的一个Spring上下文对象。
        /这行代码只要执行:就相当于启动了Spring容器，解析spring .xml文件，并且实例化所有的bean对象，放到spring容
        器当中。

         */
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml","xml/beans.xml");


        //2 根据bean的id从spring容器获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        //spring6.bean.User@6d763516
        System.out.println(userBean);

//        Object nowTime = applicationContext.getBean("nowTime");
        Date nowTime = applicationContext.getBean("nowTime", Date.class);
        System.out.println(nowTime);
        //格式化日期 需要转类型  想要不转 可以在getBean("nowTime", Date.class); 加需要转的类型
        // 不过这里 format object也可以使用
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = sdf.format(nowTime);
        System.out.println(format);

    }


    @Test
    public void testSpath(){
        //从系统文件获取配置文件
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("d:/beans.xml");
        Object nowTime = applicationContext.getBean("nowTime");
        System.out.println(nowTime);
    }

    @Test
    public void testLog4j(){

        new ClassPathXmlApplicationContext("spring.xml");
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
        logger.info("我是infoxxx");
        logger.debug("我是debugxxx");
        logger.error("我是errorxxx");
    }
}

package spring6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: User
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class User10 implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean {

    private String name;

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值");
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User10() {
        System.out.println("第一步：无参xxx");
    }

    //自己写 自己配 这个方法
    public void initBean(){
        System.out.println("第六步：初始化 bean");
    }

    //自己写 自己配 这个方法
    public void destroyBean(){
        System.out.println("第十步：销毁 bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("第三步： BeanClassLoaderAware`s setBeanClassLoader 方法执行了。。 ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        //System.out.println("第三步： BeanFactoryAware`s setBeanFactory 方法执行了。。 ");
    }

    @Override
    public void setBeanName(String name) {
        //System.out.println("第三步： BeanNameAware`s setBeanName 方法执行了。。 ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第九步： DisposableBean`s destroy 方法执行了。。 ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第五步： DisposableBean`s afterPropertiesSet 方法执行了。。 ");
    }
}

package spring6;

import org.springframework.beans.factory.FactoryBean;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: PersonFactoryBean
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class PersonFactoryBean implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    //有默认实现 是否为单例 默认为是单例
    //修改 return false
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}

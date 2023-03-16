package spring6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: LogBeanPostProcessor
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class LogBeanPostProcessor7 implements BeanPostProcessor {


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步： 执行Bean后处理器的After方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第三步： 执行Bean后处理器的 Before 方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}

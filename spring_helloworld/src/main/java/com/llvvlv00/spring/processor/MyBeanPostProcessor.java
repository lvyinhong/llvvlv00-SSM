package com.llvvlv00.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Package com.llvvlv00.spring.processor
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    // 此方法在bean的生命周期初始化之前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor==>后置处理器的 postProcessBeforeInitialization");
        return bean;
    }

    // 此方法在bean的生命周期初始化之后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor==>后置处理器的 postProcessAfterInitialization");
        return bean;
    }
}

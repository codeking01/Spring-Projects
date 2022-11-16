package com.codeking.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author : codeking
 * @date : 2022/11/16 16:13
 */
public class MyBeanPost implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("pre第三步，在初始化之之前执行的方法");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after第三步,在初始化之后执行的方法");
        return bean;
    }
}

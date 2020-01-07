package com.enjoy.study7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author 邱润泽 bullock
 */
@Component
public class GeekQBeanPostprocessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //返回一个对象 传过来的
        //在初始化方法之前进行后置处理工作
        //什么时候调用 在init-method=init 之前调用
        System.out.println("postProcessBeforeInitialization ...."+beanName+"....."+bean);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization ...."+beanName+"....."+bean);
        return bean;
    }
}

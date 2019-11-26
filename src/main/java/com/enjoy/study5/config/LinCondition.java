package com.enjoy.study5.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 邱润泽 bullock
 *
 * context 判断条件可以使用得上下文环境
 *
 * AnnotatedTypeMetadata metadata 注解信息
 */
public class LinCondition implements Condition {


    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //是否为 window系统

        //beanFactory  从们得容器中获取实例话后得bean
        //factoryBean  可以把我们得Java实例 Bean 通过factoryBean 注册到容器中

        //能获取到IOC 容器 正在使用得beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取当前得环境变量（包括我们得操作是windows还是linux）
        Environment environment = context.getEnvironment();
        String osName  = environment.getProperty("os.name");

        if(osName.contains("Linux")){
            return true;
        }
        return false;
    }
}

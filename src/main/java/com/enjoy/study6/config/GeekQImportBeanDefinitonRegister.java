package com.enjoy.study6.config;

import com.enjoy.study6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 邱润泽 bullock
 */
public class GeekQImportBeanDefinitonRegister implements ImportBeanDefinitionRegistrar {


    /**
     * AnnotationMetadata importingClassMetadata 当前类的注解信息
     * @param importingClassMetadata 当前类的注解信息
     * @param registry BeanDefinition注册类
     *
     *     把所有需要添加到容器中的bean加入;
     *
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {


        boolean b1 = registry.containsBeanDefinition("com.enjoy.study6.bean.Dog");

        boolean b2 = registry.containsBeanDefinition("com.enjoy.study6.bean.Cat");

        //如果dog 和cat 同时存在在IOC 中 则Pig 加入到容器
        //对于我们要注册的bean 给 bean 进行封装
        if(b1&&b2){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig",beanDefinition);
        }


    }
}

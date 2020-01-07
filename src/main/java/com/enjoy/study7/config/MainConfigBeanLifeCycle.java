package com.enjoy.study7.config;

import com.enjoy.study.entity.Person;
import com.enjoy.study6.bean.Cat;
import com.enjoy.study6.bean.Dog;
import com.enjoy.study6.config.GeekQFactoryBean;
import com.enjoy.study6.config.GeekQImportBeanDefinitonRegister;
import com.enjoy.study6.config.GeekQImportSelector;
import com.enjoy.study7.bean.Bike;
import org.springframework.context.annotation.*;

/**
 * @author 邱润泽 bullock
 *
 * 单实例bean 的初始化与销毁
 * --------------------------- one -----------
 *     @Bean(initMethod = "init",destroyMethod = "derstory" )
 * --------------------------- two ----------
 * 1.实现initializingbean 接口的afterPropertiesSet() 方法 当beanFactory 创建好对象 且把bean所有属性设置好之后 会调用这个方法 相当于初始化方法
 * 2.实现DisposableBean 的 destory()方法 当bean销毁时候会把单实例bean进行销毁
 * --------------------------- three --------------------
 * JSR250 -- create
 * @PostConstruct 在Bean 创建完成 且属于赋值后进行初始化 属于JDK规范的注解  JSR 是由 JDK提供的一组规范
 * @PreDestory 在bean 将要移除之前进行通知 在容器晓辉之前进行清理工作
 *
 * @scope
 */
//配置类=配置文件
@ComponentScan(value = "com.enjoy.study7.bean")
@Configuration
public class MainConfigBeanLifeCycle {

    @Bean("person")
    public Person person(){
        System.out.println("------->创建对象 给容器中添加person");
        return new Person("king",20);
    }

    //对于单实例的bean 正常调用初始化和销毁方法
    //对于多实例bean 容器只会负责初始化 但是不会管理bean容器关闭时不会调用销毁方法
    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "derstory" )
    public Bike bike(){
        return new Bike();
    }

}

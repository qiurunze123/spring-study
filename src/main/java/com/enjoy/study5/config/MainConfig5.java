package com.enjoy.study5.config;

import com.enjoy.study.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author 邱润泽 bullock
 *
 * IOC容器 ： 多实例 仅当bean 被使用过得时候才被创建
 *           单实例 创建IOC容器的时候实例bean 就被创建
 *
 * @scope
 */
//配置类=配置文件
@Configuration
public class MainConfig5 {

    @Lazy
    @Bean
    public Person person(){
        System.out.println("------->创建对象 给容器中添加person");
        return new Person("king",20);
    }

    //如果你想要注册到容器中得话那么你就需要先执行我们得 WindowCondition.class
    @Conditional(WindowCondition.class)
    @Bean
    public Person lison(){
        System.out.println("------->创建对象 给容器中添加lison");
        return new Person("Lison",25);
    }


    @Conditional(LinCondition.class)
    @Bean
    public Person jr(){
        System.out.println("------->创建对象 给容器中添加jr");
        return new Person("jr",38);
    }

}

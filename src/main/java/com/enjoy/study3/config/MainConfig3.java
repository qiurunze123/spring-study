package com.enjoy.study3.config;

import com.enjoy.study.entity.Person;
import org.springframework.context.annotation.*;

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
public class MainConfig3 {

    //给容器注册一个bean 类型为返回值类型

    /**
     * prototype: 多实例 IOC容器启动的时候
     * IOC 容器启动并不会调用方法创建对象而是每次获取的时候才会调用方法
     * 创建对象
     *
     * singleton ： 单实例 (默认) IOC启动的时候会调用方法并放到IOC容器中 以后每次获取就是直接从容器中
     * 拿（大Map get）的 同一个bean
     *
     * request 主要针对 web应用 递交一次请求创建一个实例
     * session 同一个session 创建一个实例
     *
     * @lazy 懒加载 只有调用的时候才会去创建 针对单实例 ：默认在容器启动的时候 创建对象
     * 懒加载：容器启动的时候不能创建对象 仅当第一个使用bean的时候才会去创建
     *
     * @return
     */
    @Scope("prototype")
    @Bean
    public Person person(){
        return new Person("king",35);
    }


}

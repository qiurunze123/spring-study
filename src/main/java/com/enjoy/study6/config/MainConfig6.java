package com.enjoy.study6.config;

import com.enjoy.study.entity.Person;
import com.enjoy.study6.bean.Cat;
import com.enjoy.study6.bean.Dog;
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
@Import(value = {Dog.class , Cat.class,GeekQImportSelector.class,
        GeekQImportBeanDefinitonRegister.class})
public class MainConfig6 {


    /**
     * 1. @bean [导入第三方组件类或者包得组件] 比如 person 为第三方得类 需要我们在IOC容器中使用
     *
     * 2. 包扫描 + 组件 得标注注解(@componentScan @Controller @Service @Responsitory @Componet  )一般针对我们自己写的类
     * 3. @Import [快速给容器导入一个组件 ] 注意 @bean 有点简单 构造得一个
     *    a.@import 要导入容器的这个组件 容器会自动注册这个组件 bean 的 id为全类名
     *    b.ImportSelector 是一个接口 返回需要导入的容器的组件全类名数组
     *    c.ImportBeanDefinitonRegisterar: 可以手动添加组件 到IOC容器 所有bean 的 注册 可以使用BeanDifinitionRegister
     *       GeekQImportBeanDefinitonRegister 实现 ImportBeanDefinitionRegistrar 接口 即可
     *
     * 4.使用 spring 提供的 Factorybean(工厂bean) 进行注册
     *
     *
     * 单例的对象 在容器启动的时候就已经 初始化
     *
     *
     *
     * @return
     */
    //容器启动初始化时person得bean实例
    @Bean("person")
    public Person person(){
        System.out.println("------->创建对象 给容器中添加person");
        return new Person("king",20);
    }

    @Bean
    public  GeekQFactoryBean geekQFactoryBean(){
        return new GeekQFactoryBean();
    }

}

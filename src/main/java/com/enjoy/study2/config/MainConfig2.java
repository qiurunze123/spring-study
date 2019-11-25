package com.enjoy.study2.config;

import com.enjoy.study.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

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
@ComponentScan(value = "com.enjoy.study2",
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,classes = BullockTypeFilter.class)}
,useDefaultFilters = false
        )
public class MainConfig2 {

    //类型为返回值类型
    @Bean
    public Person person(){
        return new Person("king",35);
    }


}

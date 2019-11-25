package com.enjoy.study.config;

import com.enjoy.study.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 邱润泽 bullock
 */
//配置类=配置文件
@Configuration
public class MainConfig {

    //类型为返回值类型
    @Bean
    public Person person(){
        return new Person("king",35);
    }


}

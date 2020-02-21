package com.studyaop.calc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *  @author qiurunze
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
//@EnableAspectJAutoProxy(exposeProxy = true)
public class MainConfig {

    @Bean
    public Calculate calculate() {
        return new GeekCalculate();
    }

    @Bean
    public GeekLogAspect tulingLogAspect() {
        return new GeekLogAspect();
    }
}

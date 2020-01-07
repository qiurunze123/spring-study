package com.enjoy.study7.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 邱润泽 bullock
 */
@Component
public class Jeep {

    public Jeep(){
        System.out.println("Jeep ...... constructor .......");
    }

    @PostConstruct
    public void init(){
        System.out.println("Jeep ...... init   ...... PostConstruct ......");
    }

    @PreDestroy
    public  void destory(){
        System.out.println("Jeep ...... PreDestroy ......");
    }
}

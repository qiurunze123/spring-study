package com.enjoy.study8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 邱润泽 bullock
 */
public class Test {


    public static void main(String[] args) {

//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
//
//        System.out.println(ac.getBean(X.class));


        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        //可以手动关闭循环依赖
        ac.setAllowCircularReferences(false);
        ac.refresh();
        System.out.println(ac.getBean(X.class));

    }
}

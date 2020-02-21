package com.studyaop.auth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 邱润泽 bullock
 */
@ComponentScan("com.studyaop")
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);

        BuyService buyService = context.getBean(BuyService.class);
        buyService.buyItem(1);

        CharService charService = context.getBean(CharService.class);
        charService.privateChat(123);
    }
}

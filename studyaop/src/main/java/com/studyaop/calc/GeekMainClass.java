package com.studyaop.calc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  @author qiurunze
 */
public class GeekMainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        Calculate calculate = (Calculate) ctx.getBean("calculate");
        int retVal = calculate.add(2,4);
        System.out.println("运算结果是:"+retVal);
        System.out.println(ctx.getBean("tulingLogAspect"));
    }
}

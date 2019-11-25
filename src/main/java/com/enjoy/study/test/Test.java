package com.enjoy.study.test;

import com.alibaba.fastjson.JSON;
import com.enjoy.study.config.MainConfig;
import com.enjoy.study.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 邱润泽 bullock
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext app =
                new ClassPathXmlApplicationContext("beans.xml");


        Person person = (Person) app.getBean("person");

        System.out.println(person.getAge());


        ApplicationContext appAnno = new AnnotationConfigApplicationContext(MainConfig.class);

        Person person1 = (Person) appAnno.getBean("person");

        System.out.println(JSON.toJSON(person1));

        String[] namesForBean = appAnno.getBeanNamesForType(Person.class);

        for (String name:namesForBean) {
            System.out.println(name);
        }

    }
}

package com.enjoy.study6.config;

import com.enjoy.study6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 邱润泽 bullock
 */
public class GeekQFactoryBean implements FactoryBean<Monkey> {


    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    public Class<?> getObjectType() {
        return Monkey.class;
    }

    //是否设置为多实例
    public boolean isSingleton() {
        return false;
    }
}

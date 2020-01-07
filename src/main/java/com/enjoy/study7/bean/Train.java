package com.enjoy.study7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author 邱润泽 bullock
 */
@Component
public class Train implements InitializingBean, DisposableBean {

    public  Train(){
        System.out.println("train ...... constructor .....");
    }

    //当bean 销毁时 调用此方法
    public void destroy() throws Exception {

        System.out.println("Train ...... destory ......");

    }

    //当bean 初始化完成时调用
    public void afterPropertiesSet() throws Exception {

        System.out.println("train ......afterPropertiesSet...... work ......");

    }
}

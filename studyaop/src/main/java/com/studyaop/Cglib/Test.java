package com.studyaop.Cglib;

/**
 * @author 邱润泽 bullock
 */
public class Test {


    public static void main(String[] args) {
        Hello helloProxy = CGlibProxy.getInstance().getProxy(Hello.class);

        helloProxy.say("欢迎关注！");
    }
}

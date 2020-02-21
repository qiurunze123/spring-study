package com.studyaop.jdkProxy;

/**
 * @author 邱润泽 bullock
 */
public class Test {

    public static void main(String[] args) {
        JdkProxy proxy = new JdkProxy(new Hello());

        Ihello ihello = proxy.getProxy();

        ihello.say("吃了吗");
    }
}

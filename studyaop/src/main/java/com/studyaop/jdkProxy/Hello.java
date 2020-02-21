package com.studyaop.jdkProxy;

/**
 * @author 邱润泽 bullock
 */
public class Hello implements Ihello {
    @Override
    public void say(String name) {
        System.out.println("  hello ,"+name);
    }
}

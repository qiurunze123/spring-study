package com.studyaop.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 邱润泽 bullock
 */
public class JdkProxy implements InvocationHandler {

    private Object  target;

    public JdkProxy(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }


    public void before(){
        System.out.println("this is before function");
    }


    public void after(){
        System.out.println("this is after function");
    }



    public <T> T getProxy(){
        System.out.println("我是谁");
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}

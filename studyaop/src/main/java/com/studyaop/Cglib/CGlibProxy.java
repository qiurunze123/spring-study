package com.studyaop.Cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 邱润泽 bullock
 */
public class CGlibProxy implements MethodInterceptor {


    private static CGlibProxy instance = new CGlibProxy();

    private CGlibProxy(){

    }

    public static CGlibProxy getInstance(){
        return instance;
    }
    public void before(){
        System.out.println("this is before function");
    }


    public void after(){
        System.out.println("this is after function");
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o,objects);
        after();
        return result;
    }

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }
}

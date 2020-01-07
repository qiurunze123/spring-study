package com.enjoy.Tools;

import java.lang.reflect.Method;

/**
 * @author 邱润泽 bullock
 */
public interface GQSpringInvocationHandler  {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}

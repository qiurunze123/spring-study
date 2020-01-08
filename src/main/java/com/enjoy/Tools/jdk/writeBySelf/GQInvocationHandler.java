package com.enjoy.Tools.jdk.writeBySelf;

import java.lang.reflect.Method;

public interface GQInvocationHandler {
	 public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}

package com.enjoy.Tools.jdk.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;


/**
 * @author 邱润泽 bullock
 */
public class JdkDynamicProxyTest {

    public static void main(String[] args) throws Exception {        // 打开保存JDK动态代理生成的类文件
        /**
         * 第一种方法: 通过 Proxy.newProxyInstance 方法 获取代理对象
         */
        System.out.println("-------------------第一种创建代理类方法--------------");
        //创建一个实例对象，这个对象是被代理的对象，委托类
        Person person = new SoftwareEngineer("Vincent");
        //创建一个与代理类相关联的InvocationHandler,每一个代理类都有一个关联的 InvocationHandler，并将代理类引用传递进去
        InvocationHandler Handler = new PersonInvocationHandler<>(person);
        //创建一个 代理对象 personProxy 来代理 person，创建的代理对象的每个执行方法都会被替换执行Invocation接口中的invoke方法
        Person personProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, Handler);
        /** 代理类信息 */
        System.out.println("package = " + personProxy.getClass().getPackage() +
                " SimpleName = " + personProxy.getClass().getSimpleName() + " name ="
                + personProxy.getClass().getName() + " CanonicalName = " + ""
                + personProxy.getClass().getCanonicalName() + " 实现的接口 Interfaces = " +
                Arrays.toString(personProxy.getClass().getInterfaces()) + " superClass = "
                + personProxy.getClass().getSuperclass() + " methods =" + Arrays.toString(personProxy.getClass().getMethods()));
        // 通过 代理类 执行 委托类的代码逻辑
        personProxy.goWorking(personProxy.getName(), "深圳");

    }

}

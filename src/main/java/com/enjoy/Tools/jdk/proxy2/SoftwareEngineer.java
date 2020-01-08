package com.enjoy.Tools.jdk.proxy2;

/**
 * @author 邱润泽 bullock
 * 动态代理委托类 --- 实现， 实现接口 Person。 被动态生成的代理类代理
 */
public class SoftwareEngineer implements Person {

    public SoftwareEngineer() {

    }
    public SoftwareEngineer(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goWorking(String name, String dst) {
        System.out.println("name =" + name + " ， 去 " + dst + " 工作");
    }
}

package com.enjoy.Tools.proxy2;

/**
 * @author 邱润泽 bullock
 * 创建Person 接口 用于定义 委托类和代理类之间的约束行为
 */
public interface Person {

    /**
     * @param name 人名
    * @param dst 工作目的地
    */
    void goWorking(String name, String dst);
    /**
     * 获取名称
     * @return
     */
    String getName( );
    /**
     * 设置名称
     * @param name
     */
    void  setName(String name);
}

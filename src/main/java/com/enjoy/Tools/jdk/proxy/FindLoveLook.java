package com.enjoy.Tools.jdk.proxy;

/**
 * @author 邱润泽 bullock
 */
public class FindLoveLook {

    public static void main(String[] args) throws Exception {



			Person obj = (Person)new MeiPo().getInstance(new James());
			System.out.println(obj.getClass());
			obj.findLove();
    }
}

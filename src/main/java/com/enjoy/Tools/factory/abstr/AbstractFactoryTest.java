package com.enjoy.Tools.factory.abstr;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		DefaultFactory factory = new DefaultFactory();
		
		System.out.println(factory.getCar("Benz"));

		//设计模式的经典之处 在于 解决了 双方的痛处
		//解放了我们的双手
	}
}

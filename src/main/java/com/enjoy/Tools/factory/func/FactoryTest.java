package com.enjoy.Tools.factory.func;

public class FactoryTest {

	public static void main(String[] args) {
		
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		

	}
	
}

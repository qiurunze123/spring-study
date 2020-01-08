package com.enjoy.Tools.factory.simplefactory;


import com.enjoy.Tools.factory.Car;

public class SimpleFactoryTest {

	
	
	public static void main(String[] args) {
	
		Car car = new SimpleFactory().getCar("Audi");
		System.out.println(car.getName());
		
	}
	
}

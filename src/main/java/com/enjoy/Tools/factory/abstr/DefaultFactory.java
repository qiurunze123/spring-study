package com.enjoy.Tools.factory.abstr;


import com.enjoy.Tools.factory.Car;

public class DefaultFactory extends AbstractFactory {


	//默认传奥迪
	private AudiFactory defaultFactory = new AudiFactory();

	public Car getCar() {
		return defaultFactory.getCar();
	}

}

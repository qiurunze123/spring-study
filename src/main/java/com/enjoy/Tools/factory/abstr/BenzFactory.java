package com.enjoy.Tools.factory.abstr;


import com.enjoy.Tools.factory.Benz;
import com.enjoy.Tools.factory.Car;

public class BenzFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}

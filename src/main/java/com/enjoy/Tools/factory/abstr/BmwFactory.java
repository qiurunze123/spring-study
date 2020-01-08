package com.enjoy.Tools.factory.abstr;


import com.enjoy.Tools.factory.Bmw;
import com.enjoy.Tools.factory.Car;

public class BmwFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}

package com.enjoy.Tools.factory.func;


import com.enjoy.Tools.factory.Bmw;
import com.enjoy.Tools.factory.Car;

public class BmwFactory implements Factory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}

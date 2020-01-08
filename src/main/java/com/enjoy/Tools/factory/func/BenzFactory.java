package com.enjoy.Tools.factory.func;

import com.enjoy.Tools.factory.Benz;
import com.enjoy.Tools.factory.Car;

public class BenzFactory implements Factory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}

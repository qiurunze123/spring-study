package com.enjoy.Tools.factory.func;

import com.enjoy.Tools.factory.Audi;
import com.enjoy.Tools.factory.Car;

public class AudiFactory implements Factory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}

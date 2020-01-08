package com.enjoy.Tools.factory.abstr;

import com.enjoy.Tools.factory.Audi;
import com.enjoy.Tools.factory.Car;

//具体业务逻辑封装
public class AudiFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}

package com.hx.factory;

import com.hx.entity.Car;

public class StaticFactory {

	private static Car car = new Car();
	
	public static Car createCar(String name) {
		return car;
	}
}

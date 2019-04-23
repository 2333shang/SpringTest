package com.hx.factory;

import com.hx.entity.Car;

public class BaseFactory {

	private Car car = new Car();
	
	public Car createCar(String name) {
		return car;
	}
}

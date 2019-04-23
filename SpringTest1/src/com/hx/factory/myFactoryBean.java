package com.hx.factory;

import org.springframework.beans.factory.FactoryBean;

import com.hx.entity.Car;

public class myFactoryBean implements FactoryBean{

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object getObject() throws Exception {
		return new Car(name,120);
	}

	@Override
	public Class getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}

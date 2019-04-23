package com.hx.entity;

public class Car {

	private String name;
	private double money;
	private int speed;
	
	public Car(String name, double money, int speed) {
		super();
		this.name = name;
		this.money = money;
		this.speed = speed;
	}
	
	public Car() {
		super();
	}

	public Car(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}

	public Car(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void init() {
		System.out.println("init()...");
	}
	
	public void destory() {
		System.out.println("destory()...");
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", money=" + money + ", speed=" + speed + "]";
	}
	
}

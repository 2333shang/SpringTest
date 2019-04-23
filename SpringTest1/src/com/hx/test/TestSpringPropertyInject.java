package com.hx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hx.datasources.DataSources;
import com.hx.entity.Car;
import com.hx.entity.Person;

public class TestSpringPropertyInject {

	String conf = "classpath:applicationContext.xml";
	ApplicationContext ctx = null;
	
	@Before
	public void initSpringIOC() {
		ctx = new ClassPathXmlApplicationContext(conf);
	}
	
	@Test
	public void testSetter() {
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
	
	@Test
	public void testConstructor() {
		Person person = (Person) ctx.getBean("person2");
		System.out.println(person);
	}
	
	@Test
	public void testCarConstructor() {
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
	}
	
	@Test
	public void testSpectifyChar() {
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
	
	@Test
	public void testCascade() {
		Person person = (Person) ctx.getBean("person3");
		System.out.println(person);
	}
	
	@Test
	public void testProperty() {
		DataSources dataSources = 
				   (DataSources) ctx.getBean("dataSources");
		System.out.println(dataSources);
	}
	
	@Test
	public void testPNamespace() {
		Person person = (Person) ctx.getBean("person4");
		System.out.println(person);
	}
	
	/**
	 * byType:根据类型匹配
	 * byName:根据id匹配
	 */
	@Test
	public void testAutowired() {
		Person person = (Person) ctx.getBean("person5");
		System.out.println(person);
	}

	@Test
	public void testOutSideProperty() {
		DataSources dataSources = 
				   (DataSources) ctx.getBean("dataSources2");
		System.out.println(dataSources);
	}

	
}

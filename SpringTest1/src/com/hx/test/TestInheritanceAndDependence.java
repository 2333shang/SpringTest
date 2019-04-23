package com.hx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hx.entity.Person;

public class TestInheritanceAndDependence {

	String conf = "classpath:applicationContext.xml";
	ApplicationContext ctx = null;
	
	@Before
	public void initSpringIOC() {
		ctx = new ClassPathXmlApplicationContext(conf);
	}
	
	//自动注入和abstract属性不能被继承
	@Test
	public void testInheritance() {
		Person person = (Person) ctx.getBean("person7");
		System.out.println(person);
	}
	
	@Test
	public void testInheritance2() {
		Person person = (Person) ctx.getBean("person7");
		System.out.println(person);
	}
	
	@Test
	public void testDependence() {
		Person person = (Person) ctx.getBean("person7");
		System.out.println(person);
	}

}

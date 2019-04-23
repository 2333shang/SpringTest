package com.hx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hx.entity.Person;

public class TestInitSpringIOC {

	String conf = "classpath:applicationContext.xml";
	ApplicationContext ctx = null;
	
	@Before
	public void initSpringIOC() {
		ctx = new ClassPathXmlApplicationContext(conf);
	}
	
	@Test
	public void testCreateBean() {
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		person = (Person) ctx.getBean("person2",Person.class);
		System.out.println(person);
		//Object[]可以给bean赋值：构造器赋值或者工厂方法赋值
		person = (Person) ctx.getBean("person2",new Object[] {"张三"});
		System.out.println(person);
	}
	
	@Test
	public void testCreateBeanScope() {
		Person person = (Person) ctx.getBean("person");
		Person person2 = (Person) ctx.getBean("person");
		System.out.println(person == person2);
		
		person = (Person) ctx.getBean("person2");
		person2 = (Person) ctx.getBean("person2");
		System.out.println(person == person2);
	}
	/**
	 * lazy-init只对单例对象有效,非单例对象在初始化容器时都会初始化出一个对象
	 */
	@Test
	public void testCreateBeanTime() {
		System.out.println("IOC init...");
		Person person = (Person) ctx.getBean("person");
	}

}

package com.hx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hx.entity.Car;

public class TestTimeAndFactory {

	String conf = "classpath:applicationContext.xml";
	ApplicationContext ctx = null;
	
	@Before
	public void initSpringIOC() {
		ctx = new ClassPathXmlApplicationContext(conf);
	}
	
	@Test
	public void testInit() {
		Car car = (Car) ctx.getBean("car2");
		System.out.println(car);
		((AbstractApplicationContext) ctx).close();
	}
	
	@Test
	public void testStaticFactory() {
		Car car = (Car) ctx.getBean("car3");
		System.out.println(car);
	}
	
	@Test
	public void testFactory() {
		Car car = (Car) ctx.getBean("car4");
		System.out.println(car);
	}
	
	@Test
	public void testFactoryBean() {
		Car car = (Car) ctx.getBean("car5");
		System.out.println(car);
	}

}

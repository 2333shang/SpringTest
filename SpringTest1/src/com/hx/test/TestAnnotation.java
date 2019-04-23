package com.hx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hx.controller.PeopleAction;
import com.hx.dao.PeopleDao;
import com.hx.servie.UserService;

public class TestAnnotation {

	String conf = "classpath:applicationContext-annotation.xml";
	ApplicationContext ctx = null;
	
	@Before
	public void initSpringIOC() {
		ctx = new ClassPathXmlApplicationContext(conf);
	}
	
	@Test
	public void testComponent() {
		PeopleDao dao = 
				(PeopleDao) ctx.getBean("peopleDao");
		dao.buy();
	}
	
	@Test
	public void testAutowired() {
		PeopleAction peopleAction = 
				(PeopleAction) ctx.getBean("peopleAction");
		peopleAction.purchaseCar();
	}
	
	@Test
	public void testScope() {
		PeopleAction peopleAction = 
				(PeopleAction) ctx.getBean("peopleAction");
		
		PeopleAction peopleAction2 = 
				(PeopleAction) ctx.getBean("peopleAction");
		System.out.println(peopleAction == peopleAction2);
	}
	
	@Test
	public void testAutowiredMethod() {
		PeopleAction peopleAction = 
				(PeopleAction) ctx.getBean("peopleAction");
		peopleAction.purchaseCar();
	}
	
	@Test
	public void testAutowiredAndQualifier() {
		PeopleAction peopleAction = 
				(PeopleAction) ctx.getBean("peopleAction");
		peopleAction.purchaseCar();
	}
	
	@Test
	public void test() {
		UserService userService = 
				(UserService) ctx.getBean("userService");
		userService.test();
	}

}

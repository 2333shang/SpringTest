package com.hx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hx.dao.PeopleDao;

@Controller
@Scope("prototype")
public class PeopleAction {

	private PeopleDao peopleDao;
	@Autowired
	@Qualifier("peopleDao")
	public void setPeopleDao(PeopleDao peopleDao){
		this.peopleDao = peopleDao;
	}
	
	public void purchaseCar() {
		peopleDao.buy();
	}
	
}

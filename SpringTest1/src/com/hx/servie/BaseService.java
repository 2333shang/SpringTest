package com.hx.servie;

import org.springframework.beans.factory.annotation.Autowired;

import com.hx.dao.BaseDao;

public class BaseService<T> {

	@Autowired
	private BaseDao<T> baseDao;
	
	public void test() {
		System.out.println(baseDao);
	}
}

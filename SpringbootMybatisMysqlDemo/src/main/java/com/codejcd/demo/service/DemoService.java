package com.codejcd.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codejcd.demo.dao.DemoDao;

@Service
public class DemoService {
	
	@Autowired
	private DemoDao demoDao;
	
	public String testSelectOne(int num) throws Exception {
		return demoDao.testSelectOne(num);
	}
}

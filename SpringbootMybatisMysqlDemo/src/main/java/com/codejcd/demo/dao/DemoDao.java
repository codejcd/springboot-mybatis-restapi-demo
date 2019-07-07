package com.codejcd.demo.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class DemoDao {

	private final static String NAMESPACE = "com.codejcd.demo.mapper.TestMapper.";
	
	@Autowired
	@Qualifier("sqlSession")
	private SqlSessionTemplate sqlSession;
	
	public String testSelectOne(int num) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "selectTest", num); 
	}
}

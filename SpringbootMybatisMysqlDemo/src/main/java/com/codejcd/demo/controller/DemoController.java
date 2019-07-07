package com.codejcd.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codejcd.demo.service.DemoService;

@RestController
public class DemoController {
	 
    @Autowired
    private DemoService demoService;
    
    @RequestMapping("demo")
    public String DemoAPI(Model model) {
    	System.out.println("demo controller");
    	String result = "error";
    	try {
    		result = demoService.testSelectOne(1);
    		System.out.println(result);
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	return result;
    } 
}

package com.web.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.beans.HelloBean;

@RestController
public class HelloWorld {

	@RequestMapping(path="/hello",method=RequestMethod.GET)
	public String helloWorldService() {
		
		return "Hai Hello";
		
	}
	
	@RequestMapping(path="/helloBean/{name}",method=RequestMethod.GET)
	public HelloBean helloWorldServiceBean(@PathVariable String name) {
		
		HelloBean bean = new HelloBean();
		bean.setMessage(name);
		return bean;
		
	}
	
}

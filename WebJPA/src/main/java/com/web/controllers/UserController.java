package com.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.beans.UserBean;
import com.web.services.IUserService;

@RestController
public class UserController {

	
	@Autowired
	private IUserService userService;
	
	
	@RequestMapping(path="/createUser",method=RequestMethod.POST)
	public void name(@RequestBody UserBean bean) {
		userService.save(bean);
	}
	
	@RequestMapping(path="/user/{name}",method=RequestMethod.GET)
	public String test(@PathVariable String name) {
		
		return name;
	}
}

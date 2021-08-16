package com.web.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.beans.UserBean;
import com.web.dao.IUserDao;
import com.web.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public UserBean save(UserBean bean) {
		return userDao.create(bean);
	}

	
	
	
	@Override
	public List<UserBean> getUserDetails(UserBean bean) {
		return userDao.findAll(bean);
	}

}

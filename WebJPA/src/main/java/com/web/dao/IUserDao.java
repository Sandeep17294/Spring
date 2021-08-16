package com.web.dao;

import java.util.List;

import com.web.beans.UserBean;

public interface IUserDao {

	UserBean create(UserBean bean);
	
	List<UserBean> findAll(UserBean bean);
}

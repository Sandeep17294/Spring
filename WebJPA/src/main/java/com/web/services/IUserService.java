package com.web.services;

import java.util.List;

import com.web.beans.UserBean;

public interface IUserService {

	UserBean save(UserBean bean);
	
	List<UserBean> getUserDetails(UserBean bean);
}

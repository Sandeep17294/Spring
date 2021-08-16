package com.web.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.web.beans.UserBean;
import com.web.dao.IUserDao;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public UserBean create(UserBean bean) {
		entityManager.merge(bean);
		return bean;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserBean> findAll(UserBean bean) {
		
		return 	entityManager.createQuery("select uname from user_details").getResultList();
	}

	
	
}

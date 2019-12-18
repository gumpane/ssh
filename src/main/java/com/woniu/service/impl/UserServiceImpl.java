package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Service //声明被ioc管理
@Transactional  //声明本类被事务管理器切入
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDAO userDAO;
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDAO.save(user);
		System.out.println(1/0);
		User user2 = new User();
		user2.setUname("bbb");
		user2.setUpwd("bbb");
		userDAO.save(user2);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

}

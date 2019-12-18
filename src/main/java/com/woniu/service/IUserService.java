package com.woniu.service;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserService {
	void save(User user);
	List<User> findAll();
}

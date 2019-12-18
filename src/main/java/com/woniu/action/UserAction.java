package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Controller
public class UserAction extends ActionSupport {
	@Autowired
	private IUserService userService;
	private User user;
	private List<User> users;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public String save(){
		userService.save(user);
		return SUCCESS;
	}
	
	public String findAll(){
		users = userService.findAll();
		return SUCCESS;
	}
}

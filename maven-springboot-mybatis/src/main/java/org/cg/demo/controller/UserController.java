package org.cg.demo.controller;

import java.util.List;

import org.cg.demo.bean.User;
import org.cg.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="list")
	@ResponseBody
	public List<User> queryAllUser(){
		
		List<User> users = userService.queryAllUser();
		return users;
	}
}

package org.cg.demo.service.impl;

import java.util.List;

import org.cg.demo.bean.User;
import org.cg.demo.mapper.UserMapper;
import org.cg.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> queryAllUser() {
		return this.userMapper.queryAllUser();
	}

}

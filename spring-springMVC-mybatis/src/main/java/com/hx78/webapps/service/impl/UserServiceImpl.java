package com.hx78.webapps.service.impl;

import com.hx78.webapps.service.IUserService;
import com.hx78.webapps.dao.IUserDao;
import com.hx78.webapps.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}

package com.iiht.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.UserDao;
import com.iiht.model.User;

@Service("userService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public Boolean saveUser(User user) {
		return false;
	}

	public User getUserById(int userId) {
		return null;
	}

	public Boolean updateUserById(int userId, User user) {
		return false;
	}
}

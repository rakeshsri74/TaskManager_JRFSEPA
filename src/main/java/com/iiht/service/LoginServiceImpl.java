package com.iiht.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.LoginDao;
import com.iiht.model.User;

@Service("loginService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	public boolean register(User user) {
		return false;
	}

	public boolean login(String userName, String password) {
		return false;
	}
	
	public boolean resetPassword(String userName, String password) {
		return false;
	}
}

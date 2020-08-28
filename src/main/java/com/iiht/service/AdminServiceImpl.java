package com.iiht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.AdminDao;
import com.iiht.model.User;
@Service("adminService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	public List<User> listAllUsers() {
		return null;
	}

	public Boolean deleteUserById(int userId) {
		return false;
	}

}

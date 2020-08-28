package com.iiht.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean login(String userName, String password) {
		return false;
	}

	public boolean resetPassword(String userName, String password) {
		return false;
	}

}

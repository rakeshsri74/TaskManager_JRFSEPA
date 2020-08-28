package com.iiht.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iiht.model.User;
@Repository
public class UserDaoImp implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public int saveUser(User user) {
		return 0;		
	}

	public User getUserById(int userId) {
		return null;
		
	}

	public void updateUserById(int userId, User user) {
		
	}
}

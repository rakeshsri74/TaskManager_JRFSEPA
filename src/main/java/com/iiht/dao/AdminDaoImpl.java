package com.iiht.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iiht.model.User;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUserById(int userId) {
		// TODO Auto-generated method stub

	}

}

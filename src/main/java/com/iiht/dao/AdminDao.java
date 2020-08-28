package com.iiht.dao;

import java.util.List;

import com.iiht.model.User;

public interface AdminDao {
	List<User> listAllUsers();
	void deleteUserById(int userId);
}

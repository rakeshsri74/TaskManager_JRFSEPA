package com.iiht.dao;

import com.iiht.model.User;

public interface UserDao {	
	int saveUser(User user);
	User getUserById(int userId);
	void updateUserById(int userId,User user);
}

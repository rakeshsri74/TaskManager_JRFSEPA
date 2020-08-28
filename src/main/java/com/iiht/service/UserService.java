package com.iiht.service;

import com.iiht.model.User;

public interface UserService {
	Boolean saveUser(User user);
	User getUserById(int userId);
	Boolean updateUserById(int userId, User user);
}

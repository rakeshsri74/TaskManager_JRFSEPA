package com.iiht.service;

import java.util.List;

import com.iiht.model.User;

public interface AdminService {
	List<User> listAllUsers();
	Boolean deleteUserById(int userId);
}

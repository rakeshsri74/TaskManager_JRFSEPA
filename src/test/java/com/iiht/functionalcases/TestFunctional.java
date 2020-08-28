package com.iiht.functionalcases;

import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.iiht.dao.AdminDao;
import com.iiht.dao.UserDao;
import com.iiht.model.User;
import com.iiht.service.AdminServiceImpl;
import com.iiht.service.UserServiceImpl;
import com.iiht.utiltestclass.MasterData;

public class TestFunctional {

	static {
		File file = new File("output_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
	@Mock
	private UserDao userDao;
	@Mock
	private AdminDao adminDao;

	@Mock
	private User user;

	@InjectMocks
	private UserServiceImpl userServiceImpl;
	@InjectMocks
	private AdminServiceImpl adminServiceImpl;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testSaveUsers() throws Exception {
		Boolean value = userServiceImpl.saveUser(MasterData.getUserDetails());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestSaveUsers="+(value?true:false), true); 
	}

	@Test
	public void testGetUser() throws Exception {
		User user = new User();
		user.setUserId(1);
		int userId = user.getUserId();
		User userfromdb = userServiceImpl.getUserById(user.getUserId());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestGetUser="+(userId==0?true:false), true); 
	    
	}

	@Test
	public void testViewAllUsers() throws Exception {
		
		List<User> list = new ArrayList<User>();
		list.add(new User());
		list.add(new User());
	    
	    when(adminDao.listAllUsers()).thenReturn((List<User>)list);
		List<User> userList = adminServiceImpl.listAllUsers();
		File file = new File("output_revised.txt");
		FileUtils.write(file, "testViewAllUsers="+(userList==list?true:false), true); 
	}
	
	@Test
	public void testDeleteUserById() throws Exception {
		Boolean value = userServiceImpl.updateUserById(MasterData.getUserDetails().getUserId(),user);
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestDeleteUserById="+(value?true:false), true); 
	}
}

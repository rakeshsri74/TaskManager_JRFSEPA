package com.iiht.boundarycases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.iiht.model.User;
import com.iiht.utiltestclass.MasterData;

public class TestBoundary {

	//private Validator validator;
	
	static {
		File file = new File("output_boundary_revised.txt");		
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_boundary_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
	 /*@Before
	    public void setUp() throws IOException
	    {
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	        validator = factory.getValidator();
	    }*/


	
	@Test
	public void testUserNameLength() throws Exception {
		User user = MasterData.getUserDetails();
		//Set<ConstraintViolation<User>> violations = validator.validate(user);
		user.getUserName();
		int maxChar = 5;
		boolean usernameLength = ((user.getUserName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestUserNameLength=" + (usernameLength ? true : false), true);
	}

	@Test
	public void testPasswordLength() throws Exception {
		User user = MasterData.getUserDetails();
		//Set<ConstraintViolation<User>> violations = validator.validate(user);
		user.getUserPassword();
		int passwordLength = 10;
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "testPasswordLength=" + (passwordLength == 10 ? true : false), true);
	}

	@Test
	public void testActiveUser() throws Exception {
		User user = MasterData.getUserDetails();
		//Set<ConstraintViolation<User>> violations = validator.validate(user);
		user.isActive();
		boolean result = true;
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestActiveUser=" + (result ? true : false), true);
	}
}
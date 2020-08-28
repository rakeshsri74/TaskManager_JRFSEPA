package com.iiht.functionalcases;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.iiht.controller.AdminController;
import com.iiht.controller.UserController;
import com.iiht.service.UserService;
import com.iiht.utiltestclass.MasterData;

public class TestController {

	@Mock
	private UserService userService;

	@InjectMocks
	private UserController userController;

	@InjectMocks
	private AdminController adminController;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(userController, adminController).build();
	}

	@Test
	public void testSaveUser() throws Exception {
		this.mockMvc
				.perform(post("/signup").content(asJsonString(MasterData.getUserDetails()))
						.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated()).andExpect(MockMvcResultMatchers.jsonPath("$.userId").exists());
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void testGetUserById() throws Exception {
		this.mockMvc.perform(get("/user/{id}", 1).accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk());
	}

	@Test
	public void testUpdateUserById() throws Exception {
		this.mockMvc
				.perform(put("/user/{id}", 1).content(asJsonString(MasterData.getUpdateUserDetails()))
						.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	public void getUsersList() throws Exception {
		this.mockMvc.perform(get("/users")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk());				
	}

//	@Test
//	public void deleteUser() throws Exception {
//		this.mockMvc.perform(delete("/user/{id}", 1)).andExpect(status().isAccepted());
//	}
}

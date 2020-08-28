package com.iiht.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.iiht.model.User;
import com.iiht.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/signup")
	public String saveUser(@Valid @RequestBody User user, BindingResult result, Model model) {
		// Code
		return null;
	}

	@GetMapping("/user/{id}")
	public String getUserById(@PathVariable("id") int userId,Model model) {
		return null;
	}

	@PutMapping("/user/{id}")
	public String updateUserById(@PathVariable("id") int id, @Valid @RequestBody User user,Model model) {
		return null;
	}
}

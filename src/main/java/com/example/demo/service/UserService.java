package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.exceptions.InvalidCredentialsException;

public interface UserService {
	//Create
		public User addUser(User user);
		//Retrieve
		public User getUserByName(String username);
		
		//Update
		public User updateUser(User user);
		
		//Delete
		public void deleteUserById(Long id);
		
		//Login
		public User loginUser(User user) throws InvalidCredentialsException;
}
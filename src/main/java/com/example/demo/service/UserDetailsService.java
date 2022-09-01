package com.example.demo.service;

import com.example.demo.entity.UserDetails;

public interface UserDetailsService {
		//Create
			public UserDetails addUser(UserDetails userDetails);
			//Retrieve
			public UserDetails getUserById(Long id);
			
			//Update
			public UserDetails updateUser(UserDetails userDetails);
			
			//Delete
			public void deleteUserById(Long id);
	}
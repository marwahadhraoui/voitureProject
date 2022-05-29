package com.marwa.voitures.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marwa.voitures.entities.User;


public interface UserService {
	User saveUser(User u);
	User updateUser(User u);
	void deleteUser(User u);
	void deleteUserById(Long id);
	User getUser(Long id);
	List<User> getAllUsers();
	

}

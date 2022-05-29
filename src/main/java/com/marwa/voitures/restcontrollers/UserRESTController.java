package com.marwa.voitures.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marwa.voitures.entities.User;
import com.marwa.voitures.repos.UserRepository;
import com.marwa.voitures.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserRESTController {
	@Autowired
	UserRepository userRep;
	
	@Autowired
	UserService userService;
	

	@RequestMapping(value = "/login/{username}", method = RequestMethod.GET)
	public User getUserByUsername(@PathVariable("username") String username) {

		return userRep.findByUsername(username);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") Long id) {
	return userService.getUser(id);

	}
	
	@RequestMapping(method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
	return userService.saveUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
	return userService.updateUser(user);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") Long id)
	{
		userService.deleteUserById(id);
	}
	
	
}
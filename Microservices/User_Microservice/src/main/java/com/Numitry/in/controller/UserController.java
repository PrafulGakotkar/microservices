package com.Numitry.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Numitry.in.entity.User;
import com.Numitry.in.service.UserServiceImpl;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	UserServiceImpl service;
	
	@Autowired
	RestTemplate templ;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		
		 User user = this.service.getUser(id);
		List contact= this.templ.getForObject("http://CONTACT-SERVICE/contact/user/"+ id, List.class);
		
		user.setContact(contact);
		
		return user;
		
	}
}

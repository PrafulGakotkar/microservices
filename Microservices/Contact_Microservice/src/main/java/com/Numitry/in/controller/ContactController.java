package com.Numitry.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.Numitry.in.entity.Contact;
import com.Numitry.in.service.ContactServiceImpl;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactServiceImpl service;
	
	@GetMapping("/user/{id}")
	
	public List<Contact> getContact( @PathVariable Long id){
		return service.getUserContact(id);
		
	}

}

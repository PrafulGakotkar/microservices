package com.Numitry.in.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Numitry.in.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	
	List<Contact> list=List.of(
			new Contact(1l,"praful@gmail.com","Praful",11l),
			new Contact(2l,"pratik@gmail.com","Pratik",11l),
			new Contact(3l,"pragati@gmail.com","Pragati",11l),
			new Contact(4l,"ankush@gmail.com","Ankush",13l),
			new Contact(5l,"gaurav@gmail.com","Gaurav",15l),
			new Contact(6l,"ajinkya@gmail.com","Ajinkya",12l)
			);
			
	@Override
	public List<Contact> getUserContact(Long id) {
		
		return list.stream().filter(contact->contact.getUserId().equals(id)).collect(Collectors.toList());
	}

}

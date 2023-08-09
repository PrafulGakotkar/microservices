package com.Numitry.in.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Numitry.in.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	//fake user list 
		List<User> list=List.of(
				new User(11L,"Praful","7845129630"),
				new User(12L,"Ajinkya","7845129630"),
				new User(13L,"Ankush","7845129630"),
				new User(14L,"Pratik","7845129630"),
				new User(15L,"Gaurav","7845129630"),
				new User(16L,"Pragati","7845129630")
				);
				
	
	
	@Override
	public User getUser(Long Id) {
			return this.list.stream().filter(user->user.getUserId().equals(Id)).findAny().orElse(null) ;
	}
	
	
}

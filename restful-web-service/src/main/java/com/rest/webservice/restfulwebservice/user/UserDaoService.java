package com.rest.webservice.restfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	public static List<User>  users = new ArrayList<User>(); 
			
			static {
				users.add(new User(1,"Adam",new Date()));
				users.add(new User(2,"Jack",new Date()));
				users.add(new User(3,"Jill",new Date()));
										
	}
			
	public static int userCount =3;
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(null == user.getId()) {
			user.setId(++userCount);
		}
		users.add(user);
		System.out.println("********************"+users);
		return user;
	}
	
	public User findOne(int id) {
		return users.stream()
			 .filter(user -> id == user.getId())
			 .findFirst().orElse(null);
	}
	
	public User deleteById(int id) {
		
		//users.stream().filter(user ->deletedUser.getId()== user.getId()).re
		
		User deletedUser = null; 
				deletedUser=	findOne(id);
		
		if(null!= deletedUser && users.removeIf(user ->id == user.getId())) {
			return deletedUser;
		}
			
		return deletedUser;
	}
}

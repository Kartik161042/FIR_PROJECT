package com.FIR.DAO;

import java.util.ArrayList;
import java.util.List;

import com.FIR.Beans.User;
import com.FIR.Beans.UserDetails;
import com.FIR.Beans.UserType;

public class UserDao {
	
	private static List<User> users = new ArrayList<User>();
	
	static {
		User u1 = new User();
		u1.setId(1);
		u1.setEmail("kartikagra2014@gmail.com");
		u1.setPassword("123");
		u1.setUsername("kagarwal");
		
		UserDetails userDetails = new UserDetails();
		userDetails.setAddress("Bhopal");
		userDetails.setAdhar_no("1344 1234 1342 1343");
		userDetails.setAge(22);
		userDetails.setGender("Male");
		userDetails.setId(1);
		userDetails.setMobile("8319204299");
		userDetails.setName("Kartik Agarwal");
		
		u1.setUserDetails(userDetails);
		
		UserType userType = new UserType();
		userType.setId(1);
		userType.setAdmin("Pandey");
		userType.setVictim("Kartik");
		
		u1.setUserType(userType);
		users.add(u1);
	}
	
	public void addUser(User user){
		users.add(user);
	}
	
	public List<User> getAllUser(){
		return users;
	}
	
	public User getUser(int id){
		
		for(User u: users)if (u.getId() == id)return u;
		return null;
	}
	
	

}

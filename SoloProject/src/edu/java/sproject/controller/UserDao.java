package edu.java.sproject.controller;

import java.util.List;

import edu.java.sproject.dto.UserDto;

public interface UserDao {
	
	String idFind(UserDto dto);

	int insert(UserDto dto);
	
	String pwFind(UserDto dto);
	
	UserDto mainLogin(UserDto dto);

}

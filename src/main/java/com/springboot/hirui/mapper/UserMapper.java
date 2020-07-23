package com.springboot.hirui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.hirui.entity.User;

@Mapper
public interface UserMapper {

	int addUser(User user);
	
	int updateUser(User user);
	
	int deleteUserById(Integer id);
	
	User getUserById(Integer id);
	
	List<User> getAllUsers();
}

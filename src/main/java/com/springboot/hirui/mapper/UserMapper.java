package com.springboot.hirui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.hirui.entity.User;

/**
 * 
 * @author RM
 *
 */
@Mapper
public interface UserMapper {

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	int addUser(User user);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	int updateUser(User user);
	
	/**
	 * 根据Id删除用户
	 * @param id
	 * @return
	 */
	int deleteUserById(Integer id);
	
	/**
	 * 根据Id查询用户信息
	 * @param id
	 * @return
	 */
	User getUserById(Integer id);
	
	/**
	 * 查询全部用户
	 * @return
	 */
	List<User> getAllUsers();
}

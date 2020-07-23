package com.springboot.hirui.rest.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.springboot.hirui.entity.User;
import com.springboot.hirui.mapper.UserMapper;


@Component
@Path("/rm")
@Controller
public class UserController {

	@Autowired
	UserMapper userMapper;
	
	@GET
	@Path("/users")
	@Produces({MediaType.TEXT_HTML+";charset=utf-8", MediaType.APPLICATION_JSON +";charset=utf-8"})
	public void test() {
		User user1 = new User();
		user1.setUserName("rm");
		user1.setPassWord("123456");
		int i1 = userMapper.addUser(user1);
		System.out.println("插入一条数据>>>" + i1);
		
		User user2 = new User();
		user2.setId(1);
		user2.setPassWord("888888");
		int i2 = userMapper.updateUser(user2);
		System.out.println("更新一条数据>>>" + i2);
		
		int i3 = userMapper.deleteUserById(12);
		System.out.println("删除一条数据>>>" + i3);
		
		User user4 = userMapper.getUserById(16);
		System.out.println("查询1条数据>>>" + user4.toString()	);
		
		List<User> users = userMapper.getAllUsers();
		System.out.println("查询多条数据>>>" + users);
		
		return;
	}
}

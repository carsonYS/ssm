package com.my.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.hello.pojo.User;

@RestController
public class UserController {

//	@Autowired
//    private UserMapper userMapper;
	
	@RequestMapping("/user")
	public User getUser() {
		//return userMapper.selectByPrimaryKey(1);
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123456");
		user.setId(1);
		return user;
	}
}

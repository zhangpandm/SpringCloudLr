package com.zp.lr.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zp.lr.bean.Sex;
import com.zp.lr.bean.User;
@RestController
@RequestMapping("/user/")
public class UserRestController {

	private static List<User> cacheUserData; 
	
	@RequestMapping("/getUserList")
	@ResponseBody
	public List<User> getUserList(){
		if(null==cacheUserData||cacheUserData.isEmpty()){
			initUserData();
		}
		return cacheUserData;
	}
	
	private void initUserData(){
		cacheUserData = new ArrayList<User>();
		cacheUserData.add(new User("8003:"+UUID.randomUUID().toString(),"雪莉",21,Sex.female));
	}
	@RequestMapping("/saveUserList")
	@ResponseBody
	public User saveUser(User user){
		user.setUserId(UUID.randomUUID().toString());
		if(null==cacheUserData||cacheUserData.isEmpty()){
			initUserData();
		}
		cacheUserData.add(user);
		return user;
	}
	
}

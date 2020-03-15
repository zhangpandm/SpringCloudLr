package com.zp.lr.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zp.lr.bean.Sex;
import com.zp.lr.bean.User;
@RestController
@RequestMapping("/consumer/")
public class ConsummerRestController {

   @Autowired
	private RestTemplate restTemplate;
   
    private String scProvider="http://SC-PROVIDER";
	
	@RequestMapping("/searchUser")
	@ResponseBody
	public List<User> searchUser(){
		String uri="/user/getUserList";
		return (List<User>) restTemplate.getForEntity(scProvider+uri,List.class).getBody();
	}
	
	
	
}

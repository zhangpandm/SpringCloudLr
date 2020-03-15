package com.zp.lr.bean;

public class User {

	
	private String userId;
	
	private String userName;
	
	private Integer age;
	
	private Sex sex =Sex.unkonw;
	
	

	public User() {		
	}

	public User(String userId, String userName, Integer age, Sex sex) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.sex = sex;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	
	
}

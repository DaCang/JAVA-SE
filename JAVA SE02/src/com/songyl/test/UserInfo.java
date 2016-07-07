package com.songyl.test;

public class UserInfo {

	private int userId;

	private String userName;

	private Integer age;

	private String notes;

	public UserInfo() {}

	public UserInfo(int userId, String userName) {
		this(userId, userName, 0);
	}

	public UserInfo(int userId, String userName, Integer age) {
		this(userId, userName, age, null);
	}

	public UserInfo(int userId, String userName, Integer age, String notes) {
		this.userId   = userId;
		this.userName = userName;
		this.age      = age;
		this.notes    = notes;
	}

	public void setAge(Integer var)     { age = var;}

	public void setNotes(String var)    { notes = var;}

	public void setUserId(int var)      { userId = var;}

	public void setUserName(String var) { userName = var;}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", age=" + age + ", notes=" + notes + "]";
	}

}

package com.songyl.test;

/**
 * @author Administrator
 * 第二条：多个构造器参数
 */
public class Test5 {
	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo(1, "song");
		System.out.println(userInfo);
		UserInfo userInfo1 = new UserInfo(1, null, 0, "甘肃");
		System.out.println(userInfo1);
        //JavaBean模式		
		UserInfo userInfo2 = new UserInfo();
		userInfo2.setUserId(2);
		userInfo2.setUserName("syl");
		userInfo2.setAge(25);
		userInfo2.setNotes("甘肃");
		System.out.println(userInfo2);
	}
}

package com.songyl.test;

/**
 * @author Administrator
 * 传值
 */
public class Test2 {
	public static void change(String str) {
		str = "welcome";
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "1234";
		change(str);
		System.out.println(str);
	}
}

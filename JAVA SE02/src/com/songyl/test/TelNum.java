package com.songyl.test;

/**
 * @author Administrator
 * 电话号码加密
 */
public class TelNum {
	public static void main(String[] args) {
		StringBuffer telNum = new StringBuffer("13512341234");
		telNum.replace(3, 7, "****");
		System.out.println("加密后的电话号码：" + telNum.toString());
	}
}

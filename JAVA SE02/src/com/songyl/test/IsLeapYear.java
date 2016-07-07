package com.songyl.test;

import java.util.GregorianCalendar;

public class IsLeapYear {
public static void main(String[] args) {
	/*
	 * GregorianCalendar 提供的isLeapYear判断闰年的方法
	 *
	 */
	GregorianCalendar gregorianCalendar=new GregorianCalendar();

	int year=1900;
	if(gregorianCalendar.isLeapYear(year)){
		System.out.println(year+"是闰年");
	}else{
		System.out.println(year+"不是闰年");
	}
	/*
	 * 自己写的isLeapYear判断闰年的方法
	 *
	 */
	if(year%4==0&&year%100!=0||year%400==0){
		System.out.println(year+"是闰年");
	}else{
		System.out.println(year+"不是闰年");
	}
}
}

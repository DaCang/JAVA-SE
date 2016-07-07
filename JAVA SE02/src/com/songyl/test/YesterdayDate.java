package com.songyl.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Administrator
 *  java 获取昨天日期  
 */
public class YesterdayDate {
	public static void main(String[] args) {
		
	
      Calendar   cal   =   Calendar.getInstance();
	  cal.add(Calendar.DAY_OF_MONTH,   -1);
	  String yesterday = new SimpleDateFormat( "yyyy-MM-dd ").format(cal.getTime());
	  System.out.println("昨天日期："+yesterday);
	}
}

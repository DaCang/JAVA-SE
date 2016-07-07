package com.songyl.test;

import javax.swing.JOptionPane;

/**
 * @author Administrator
 * 使用输入对话框
 */
public class Test6 {
public static void main(String[] args) {
	  String name  =JOptionPane.showInputDialog("姓名?");
	  String input  =JOptionPane.showInputDialog("年龄?");
	  Integer age=Integer.parseInt(input);
	  System.out.println("name:"+name+",age:"+age);
   }
}

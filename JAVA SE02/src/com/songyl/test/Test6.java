package com.songyl.test;

import javax.swing.JOptionPane;

/**
 * @author Administrator
 * ʹ������Ի���
 */
public class Test6 {
public static void main(String[] args) {
	  String name  =JOptionPane.showInputDialog("����?");
	  String input  =JOptionPane.showInputDialog("����?");
	  Integer age=Integer.parseInt(input);
	  System.out.println("name:"+name+",age:"+age);
}
}

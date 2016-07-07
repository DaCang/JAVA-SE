package com.songyl.test;

/**
 * @author Administrator
 *  第一条：静态工厂方法代替构造器
 */
public class Test3 {
	public static void main(String[] args) {
		//new Person();
		//The constructor Person() is not visible
		new Person("s", 12);

		Person.newPerson();
		Person.newPerson("yl", 24);
		
		Person p1=new Person("p");
		Person p2=new Person("p");
		System.out.println(p1==p2);//false
		System.out.println(p1.equals(p2));//true
		
		String a1="a";
		String a2="a";
		System.out.println(a1==a2);//true
		System.out.println(a1.equals(a2));//true

		String b1=new String("b");
		String b2=new String("b");
		System.out.println(b1==b2);//false
		System.out.println(b1.equals(b2));//true
		
		
		//String $bills;
		//这种标识符是正确的
		//int 1234;
		//invalid VariableDeclarator
		

	}

}

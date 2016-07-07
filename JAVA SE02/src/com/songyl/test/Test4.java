package com.songyl.test;

/**
 * @author Administrator
 * for 循环
 */
public class Test4 {
	public static boolean foo(char C) {
		System.out.println(C);
		return true;
	}

	public static void main(String[] args) {
		int i = 0;
		for (foo('A'); foo('C') && (i < 2); foo('C')) {
			foo('D');
			i++;
		}
	}
}

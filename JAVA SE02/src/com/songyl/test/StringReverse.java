package com.songyl.test;

/**
 * @author Administrator
 * 给定一个字符串，要求把字符串前面的若干个字符移动到字符串的尾部
 * 如把字符串"abcdef"前面的2个字符'a'和'b'移动到字符串的尾部，使得原字符串变成字符串"cdefab"。
 * 目前的思路是：将字符串拼接一倍：如str1="abcdef"拼接成str2="abcdefabcdef",然后取新拼接字符串(str2)的子字符串，长度为原来的字符串(str1)长度。
 * 具体用java中的java.lang.String库中的subSequence()函数
 */
public class StringReverse {
	public static void main(String[] args) {
		String str1 = "abcdef";
		String str2 = str1 + str1;
		System.out.println("原字符串：" + str1);
		System.out.println("===========旋转字符串==========");
		for (int i = 0; i < str2.length() - str1.length(); i++) {
			System.out.println(str2.subSequence(i, (i + str1.length())));
		}
	}
}

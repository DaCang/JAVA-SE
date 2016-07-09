package com.songyl.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.songyl.util.ReversedOrderPrint;

/**
 * @author Administrator
 * 如何将一个句子倒序输出
 * 比如 my name is syl
 * 输出为：
 * syl is name my
 */
public class WordReversedOrder {
	public static void main(String[] args) {
		InputStreamReader isr;
		BufferedReader in;
		System.out.println("请用英文输入一句话：");
		try {
			isr = new InputStreamReader(System.in);
			in = new BufferedReader(isr);
			String str = in.readLine();
			System.out.println(str);
			String[] strSplited = str.split("\\s+");

			new ReversedOrderPrint<String>(strSplited);

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}

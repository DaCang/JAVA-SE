package com.songyl.test;

import com.songyl.util.ReversedOrderPrint;

/**
 * @author Administrator
 * 倒序输出+泛型
 */
public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = { "a", "b", "c", "d" };
		new ReversedOrderPrint<String>(a);
		new ReversedOrderPrint<Integer>(new Integer[] { 1, 2, 3, 4 });

	}

}

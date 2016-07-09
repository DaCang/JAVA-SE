package com.songyl.util;

/**
 * @author Administrator
 * 倒序输出
 * @param <T>
 */
public class ReversedOrderPrint<T> {// 泛型类

	T arr[];

	public ReversedOrderPrint(T[] arr) {
		super();
		this.arr = arr;
		// 倒序输出
		System.out.print("++顺序输出：");
		for (T i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("--倒序输出:");
		for (int i = arr.length; i > 0; i--) {
			System.out.print(arr[i - 1] + " ");
		}
	}

}

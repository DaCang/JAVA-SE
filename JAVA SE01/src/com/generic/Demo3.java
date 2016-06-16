package com.generic;

import org.junit.Test;

public class Demo3 {
	// 倒序输出
	public <T> void swap(T arr[]) {
		int start = 0;
		int end = arr.length - 1;
		System.out.print("转前：");
		for (T i : arr) {
			System.out.print("\t");
			System.out.print(i);
		}

		while (true) {
			if (start >= end) {
				break;

			}
			T temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		System.out.println();
		System.out.print("转后：");
		for (T i : arr) {
			System.out.print("\t");
			System.out.print(i);
		}
	}

	// 实现指定位置上的数组元素交换
	public <T> void swap(T arr[], int post1, int post2) {
		System.out.println("转前：" + arr[post1] + "，" + arr[post2]);
		T temp = arr[post1];
		arr[post1] = arr[post2];
		arr[post2] = temp;
		System.out.println("转后：" + arr[post1] + "，" + arr[post2]);
	}

	@Test
	public void test1() {
		Demo3 t = new Demo3();
		String a[] = { "s", "d", "f", "g" };
		t.swap(a);
	}

	@Test
	public void test2() {
		Demo3 t = new Demo3();
		Integer a[] = { 1, 2, 3, 4 };
		t.swap(a, 2, 3);
	}

}

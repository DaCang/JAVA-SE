package com.generic;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTest<String> st1 = new SwapTest<String>();
		SwapTest<Integer> st2 = new SwapTest<Integer>();
		
		String a[] = { "s", "d", "f", "g" };
		Integer b[] = { 1, 2, 3, 4 };
		
		st1.setArr(a);
		st1.swaptest();
		st2.setArr(b);
		st2.swaptest();
	}

}

class SwapTest<T> {// 泛型类
	T arr[];

	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	// 倒序输出
	void swaptest() {
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
		System.out.println();
	}
}

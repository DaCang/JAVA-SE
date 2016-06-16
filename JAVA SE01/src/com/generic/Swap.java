package com.generic;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTest<String> st = new SwapTest<String>();
		String a[] = { "s", "d", "f", "g" };
		st.setArr(a);
		st.swaptest();
	}

}

class SwapTest<T> {// ������
	T arr[];

	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	// �������
	void swaptest() {
		int start = 0;
		int end = arr.length - 1;
		System.out.print("תǰ��");
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
		System.out.print("ת��");
		for (T i : arr) {
			System.out.print("\t");
			System.out.print(i);
		}
	}
}
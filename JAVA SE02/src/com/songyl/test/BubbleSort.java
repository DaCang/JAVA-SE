package com.songyl.test;

/**
 * @author Administrator
 * 冒泡排序
 */
public class BubbleSort {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		System.out.print("原始的数组:");
		for (int Sortedarray : array) {
			System.out.print(Sortedarray + "\b");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				System.out.print("第" + (i + 1) + "轮" + "，第" + (j + 1) + "次排序：");
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				for (int Sortedarray : array) {
					System.out.print(Sortedarray + "\b");
				}
				System.out.println();
			}
		}
		System.out.print("排序后的数组:");
		for (int Sortedarray : array) {
			System.out.print(Sortedarray + "\b");
		}
	}
}

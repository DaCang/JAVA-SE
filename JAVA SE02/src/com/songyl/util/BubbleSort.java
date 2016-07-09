package com.songyl.util;

/**
 * @author Administrator
 * 冒泡排序
 */
public class BubbleSort {

	Integer[] array;

	public BubbleSort(Integer[] array) {
		super();
		this.array = array;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				System.out.print("第" + (i + 1) + "轮" + "，第" + (j + 1) + "次排序：");
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				for (int SortedArray : array) {
					System.out.print(SortedArray + " ");
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
		}
		System.out.print("最终排序后的数组:");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}

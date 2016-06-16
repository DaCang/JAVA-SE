package com.generic;

/*
 * 
 *  泛型
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Demo1 {

	@Test
	public void test1() {
		List<String> list = new ArrayList<String>();
		list.add("aaaa");
		String str = list.get(0);
		System.out.println(str);

	}

	@Test
	public void test2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int str = list.get(0);
		System.out.println(str);

	}

	// 传统方式
	@Test
	public void test3() {// 泛型
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}

	}

	// 增强for循环（list）
	@Test
	public void test4() {// 泛型
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		for (String value : list) {
			System.out.println(value);
		}

	}

	// Map集合的泛型表示
	@Test
	public void test5() {// 泛型
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		// Map 将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射一个值
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");

		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();// 对集合进行迭代的迭代器。
		while (it.hasNext()) {// boolean hasNext() 如果仍有元素可以迭代，则返回 true
			Map.Entry<Integer, String> entry = it.next();
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
	}

	// 增强for循环(Map)
	@Test
	public void test6() {// 泛型
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		// Map 将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射一个值
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
	}
}

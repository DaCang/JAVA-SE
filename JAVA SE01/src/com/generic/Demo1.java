package com.generic;

/*
 * 
 *  ����
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

	// ��ͳ��ʽ
	@Test
	public void test3() {// ����
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

	// ��ǿforѭ����list��
	@Test
	public void test4() {// ����
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		for (String value : list) {
			System.out.println(value);
		}

	}

	// Map���ϵķ��ͱ�ʾ
	@Test
	public void test5() {// ����
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		// Map ����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ��һ��ֵ
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");

		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();// �Լ��Ͻ��е����ĵ�������
		while (it.hasNext()) {// boolean hasNext() �������Ԫ�ؿ��Ե������򷵻� true
			Map.Entry<Integer, String> entry = it.next();
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
	}

	// ��ǿforѭ��(Map)
	@Test
	public void test6() {// ����
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		// Map ����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ��һ��ֵ
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

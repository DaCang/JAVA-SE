package com.generic;

//自定义带有泛型的方法
public class Demo2 {
	public <T> T a(T t) {
		return null;

	}

	public void testa() {
		a("ssss");
	}

	public <T, K> void b(T t, K k) {

	}
}

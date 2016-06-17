# JAVA-SE知识总结与复习

###1.[初识泛型](https://github.com/DaCang/JAVA-SE/blob/master/JAVA%20SE01/src/com/generic/Demo1.java)
	public void test1() {
		List<String> list = new ArrayList<String>();
		list.add("aaaa");//只能是String类型的，否则会出错
		//list.add(1);
		//The method add(int, String) in the type List<String> is not applicable for the arguments (int)
		String str = list.get(0);
		System.out.println(str);

	}

###2.[泛型方法](https://github.com/DaCang/JAVA-SE/blob/master/JAVA%20SE01/src/com/generic/GenericMethodTest.java)
	// generic method printArray                         
	public static <E> void printArray(E[] inputArray) {
	  // Display array elements              
	  for (E element : inputArray) {
	     System.out.printf("%s ", element);
	  }
	  System.out.println();
	}

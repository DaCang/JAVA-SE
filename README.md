# JAVA-SE知识总结与复习

###1.[初识泛型](https://github.com/DaCang/JAVA-SE/blob/master/JAVA%20SE01/src/com/generic/Demo1.java)

###2.[泛型方法](https://github.com/DaCang/JAVA-SE/blob/master/JAVA%20SE01/src/com/generic/GenericMethodTest.java)
`// generic method printArray                         
	public static <E> void printArray(E[] inputArray) {
	// Display array elements              
	for (E element : inputArray) {
	System.out.printf("%s ", element);
	}
	System.out.println();
	}`

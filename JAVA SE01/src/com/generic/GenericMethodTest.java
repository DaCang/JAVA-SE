package com.generic;

public class GenericMethodTest {
	public static void main(String args[]) {
		
		// Create arrays of Integer, Double, Character and Person
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		Person[] personArray = { new Person(1, "Tom"), new Person(2, "Jack") };

		System.out.println("Array integerArray contains:");
		printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		printArray(charArray); // pass a Character array

		System.out.println("\nArray personArray contains:");
		printArray(personArray); // pass a Character array

	}

	// generic method printArray                         
	public static <E> void printArray(E[] inputArray) {
		// Display array elements              
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
}

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

}

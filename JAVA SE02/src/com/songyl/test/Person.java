package com.songyl.test;

final class Person {

	public static Person newPerson() {
		return new Person();

	}

	public static Person newPerson(String name, int age) {
		return new Person(name, age);

	}

	String name;
	

	int age;

	public Person() {
		System.out.println("person class");
	}

	public Person(String name) { 
		this.name=name;
	}
	
	public Person(String name, int age) {
		System.out.println("------name:" + name);
		System.out.println("------age:" + age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package com.tns.java;

public class Encapsulation {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Encapsulation [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Encapsulation e =new Encapsulation();
		e.setAge(21);
		e.setId(12);
		e.setName("Suyash");
		System.out.println(e.toString());
	}

}

package com.tns.java;

public class Person {

	private String name;
	
	private String city;
	
	public Person(String name,String city) {
		this.name=name;
		this.city=city;
		
		// TODO Auto-generated constructor stub
	}
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	public static void main(String[] args) {
		Person p=new Person( );
		p.setCity("Pune");
		p.setName("Sudarshan");
		System.out.println(p.getCity());
		System.out.println(p.getName());
//		p.getName();
		
	}
}

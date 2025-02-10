package com.tns.java;


public class ConstrutorPract{

	int age;
	 public ConstrutorPract() {
		
		System.out.println("Constructor Calling ...!");
	}
	 public ConstrutorPract(int age) {
		 super();
		 this.age=age;
		
		 System.out.println("Parameterised Constructor  Calling ...!");
	 }

	@Override
	public String toString() {
		return "ConstrutorPract [age=" + age + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
	 ConstrutorPract monday=new ConstrutorPract();
	 ConstrutorPract obj=new ConstrutorPract(21);
	 
	 
	}

}

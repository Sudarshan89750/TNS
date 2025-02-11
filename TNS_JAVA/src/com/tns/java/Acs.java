package com.tns.java;



public class Acs {
	
	int var=10;// Default Access Modifier 
	public int a=20; 
	private int b=30;
	protected int  m=12;
	
	// method with access specifier 
	void defaultMethod() {
		System.out.println("default : "+var);
	}
	public void PublicMethod() {
		System.out.println("public : "+a);
		
	}
	protected void ProtectedMethod() {
		System.out.println("protected : "+m);
		
	}
	private void MethodPvt() {
		System.out.println("Private :" + b );
	}
	
	
}

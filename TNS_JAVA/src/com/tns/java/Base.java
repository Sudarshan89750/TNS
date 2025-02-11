package com.tns.java;

public class Base {
	public static void main(String[] args) {
		Acs acs=new Acs();
		acs.ProtectedMethod();
		acs.defaultMethod();
		acs.PublicMethod();
//		acs.MethodPvt() ;  not accessible 
	}

}

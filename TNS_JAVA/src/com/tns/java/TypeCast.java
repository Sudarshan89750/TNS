package com.tns.java;

public class TypeCast {
public static void main(String[] args) {
	 byte a=10;
	 int i =a;
	 System.out.println(i);
	 float f= 22.44f;
	 double d=f;
	 System.out.println(d);
	 char ch='A';
	 int cha=ch;
	 // narrowing / explicit type casting 
	 double r1=23.44444444444444444d;
	 long l1=(long)r1;   // narrowing type casting 
	 System.out.println(l1);
	 
	 long abc=838583888988898L;
	 int bb=(int)abc;
	 System.out.println(bb);
	 int nm=130;
	 byte tt=(byte)nm;
	 
	 System.out.println(tt);
	 
	 
}
}

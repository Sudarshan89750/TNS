package com.tns.java;
import java.util.Scanner;
public class ControlFlow {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		if (a > b) {
//			System.out.println("a is greater that b");
//		} else {
//			System.out.println("b is greater than a");
//		}
//		
//	
		if (a == 5) {
			System.out.println("a=5");
		} else if (a > 5) {
			System.out.println("a is greater that 5");
		} else {
			System.out.println("a is less than 5");
		}
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(a--);
		
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println("S");
		}
		while(a!=20) {
			System.out.println(a);
			a++;
		}
		char ch='A';
		do {
			System.out.println();
		}while(ch!=99);

	}

}

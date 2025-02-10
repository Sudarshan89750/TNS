package com.tns.java;

import java.util.Scanner;


public class Login {
	public static void main(String[] args) {
		// username and pass by nested if else
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name ");
		String user=sc.nextLine();		
		System.out.println("Enter the password ");
		String pass=sc.nextLine();
		if(user=="user") {
			if(pass=="1234") {
				System.out.println("Login Success...!");
			}
			else {
				System.out.println("Wrog pass....!");
			}
		}
		else {
			if(pass=="1234") {
				System.out.println("Check UserName ");
			}
			else {
				System.out.println("Wrong UserName and Pass");
			}
			
		}

		
	}

}

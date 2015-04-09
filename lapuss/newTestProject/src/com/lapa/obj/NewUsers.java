package com.lapa.obj;

import java.util.Scanner;


public class NewUsers {
	static private Scanner scan = new Scanner(System.in);
	
	public static User createUser() {
		
		System.out.println("login");
		String a = scan.nextLine();
		System.out.println("password");
		String b = scan.nextLine();
		
		User kkk = new User(a, b);
		
		return kkk;
	}
}

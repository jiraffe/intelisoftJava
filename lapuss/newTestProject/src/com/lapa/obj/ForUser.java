package com.lapa.obj;

public class ForUser {
	public static void main(String[] args) {
		User user = new User("Alex","qwert");
		User user2 = new User("Lite","qwer");
		User user3 = new User("Main","asdf");
		User user4 = new User();
		System.out.println(user2.toString());
		User user5 = NewUsers.createUser();
		System.out.println(user5.toString());
	}

}

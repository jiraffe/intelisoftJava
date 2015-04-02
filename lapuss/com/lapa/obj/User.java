package com.lapa.obj;

public class User {

	public String login;
	private String password;
	public static String url;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
		this.url = "192.168.1.1";

	};

	public boolean loginOrNot(String login, String password) {
		if (login.equals(password))
			return false;
		return true;
	};

	public User() {
	};

	public String toString() {
		return "я " + this.login + " с таким паролем = " + this.password;
	}

}

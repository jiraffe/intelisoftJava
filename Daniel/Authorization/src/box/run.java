package box;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class run {
	static Scanner scan = new Scanner(System.in);

	static int menu;

	public static void main(String args[]) throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String a = "jdbc:mysql://127.0.0.1:3306/autorisation";
		Connection con = DriverManager.getConnection(a, "root", "");
		Statement S = con.createStatement();
		System.out.println("1. Вход");
		System.out.println("2. Регистрация");
		menu = scan.nextInt();
		switch (menu) {
		case 1:
			System.out.println("Login");
			String us1 = scan.next();
			System.out.println("Password");
			String pas1 = scan.next();			
			break;
		case 2:		
			System.out.println("Придумайте логин");
			String us = scan.next();
			System.out.println("Пароль");
			String pas = scan.next();
			String adduser = "INSERT INTO autorisation.user (idUser,login,password) VALUES (null,' "
					+ us + " ',' " + pas + " ')";			
			System.out.println("Профиль создан");					
			S.executeUpdate(adduser);
			break;
		default:
			break;
		}
		
	}

}	
	


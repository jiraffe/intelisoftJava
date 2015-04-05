package com.lapa.homework3;

import java.util.Scanner;

public class index {
public static void main(String[] args) {
	boolean a = true;
	Bancomat banc = new Bancomat();
	BUser us = new BUser();
	BAdmin ad = new BAdmin();
	Scanner scan = new Scanner(System.in);

		while (a) {
			System.out.println("Главное меню для помощи - h");
			System.out.println("текущий пользователь -" + banc.bUser);
			String s = scan.nextLine();
			if (s.equals("h")) {
				System.out.println("u - выбрать пользователя");
				System.out.println("r - сменить режим аппарата");
				System.out.println("m - снять деньги");
				System.out.println("mi - положить деньги");
			} else if (s.equals("u")) {
				changeUser.SelectUser(banc, us, ad);
			} else if (scan.nextLine().equals("r")) {
			} else if (scan.nextLine().equals("m")) {
			} else if (scan.nextLine().equals("mi")) {
			}
			;
		}
	}
}

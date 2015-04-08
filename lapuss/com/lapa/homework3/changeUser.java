package com.lapa.homework3;

import java.util.Scanner;

public class ChangeUser {

	private static Scanner scan = new Scanner(System.in);

	public static Bancomat SelectUser(Bancomat banc, BUser us, BAdmin ad) {

		boolean a = true;
		int b;
		while (a) {

			System.out
					.println("¬ыберите пользовател€ 1  - клиент; 2 - инкасатор");
			b = scan.nextInt();
			if (b == 1) {
				banc.bUser = us.bUser;
				a = false;
			} else if (b == 2) {
				banc.bUser = ad.bAdm;
				a = false;
			} else {
				System.out.println("че?");
			}
			

		}
		return banc;

}}

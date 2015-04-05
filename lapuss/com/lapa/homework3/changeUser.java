package com.lapa.homework3;

import java.util.Scanner;

public class changeUser {
	
	
	public static void SelectUser(Bancomat banc,BUser us, BAdmin ad) {
		Scanner scan = new Scanner(System.in);
		boolean a = true;
		
		while(a);
		
		System.out.println("¬ыберите пользовател€ 1  - клиент; 2 - инкасатор");
		int b = scan.nextInt();
		if (b == 1) {
			banc.bUser = us.bUser;
			return;
		} else if (b == 2) {
			banc.bUser = ad.bAdm;
			return;
		} else {
			System.out.println("че?");
		}
		
	}

	

	

}

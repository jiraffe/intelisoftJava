package com.lapa.homework3;

import java.util.Scanner;

public class TakeMoney {
	private static Scanner scan = new Scanner(System.in);
	public static void Take (Bancomat banc)
	{
		if (banc.work){
			System.out.println("Сколько денег снять?");
			int a = scan.nextInt();
			Index.us.uMoney = Index.us.uMoney+a;
			banc.money = banc.money -a;
		}
		else {
		System.out.println("Аппарат временно не работает");
		}
		
	}
}

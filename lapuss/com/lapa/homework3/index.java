package com.lapa.homework3;

import java.util.Scanner;

public class Index {
	public static Bancomat banc = new Bancomat();
	public static BUser us = new BUser();
	public static BAdmin ad = new BAdmin();
	
public static void main(String[] args) {
	boolean a = true;
	Scanner scan = new Scanner(System.in);
	
		while (a) {
			System.out.println("Главное меню для помощи - h");
			System.out.println("текущий пользователь -" + banc.bUser);
			if (!banc.bUser.equals("Admin"))
				{
				if
				(!banc.bUser.equals(""))
				System.out.println("денег на счету="+us.uMoney);
				}
			if (banc.bUser.equals("Admin"))
			{
				if (banc.work)
				{
					System.out.println("Банкомат находится в обычном режиме");
				}
				else 
				{
					System.out.println("Банкомат находится в режиме обслуживания");
				}
			}			
			String s = scan.nextLine();
			if (s.equals("h")) {
				System.out.println("u - выбрать пользователя");
				System.out.println("r - сменить режим аппарата");
				System.out.println("m - снять деньги");
				System.out.println("mi - положить деньги");
			} else if (s.equals("u")) {
				ChangeUser.SelectUser(banc, us, ad);
			} else if (s.equals("r")) {
				ChangeBancMode.Change1(banc);
			} else if (s.equals("m")) {
				TakeMoney.Take(banc);
			} else if (scan.nextLine().equals("mi")) {
			}
			;
		}
	}
}

package com.lapa.homework3;

import java.util.Scanner;

public class ChangeBancMode {
	private static Scanner scan = new Scanner(System.in);

	public static Bancomat Change1(Bancomat banc) {
		if (!banc.bUser.equals("Admin")) {
			System.out.println("Узер инкоррект аццес денит");
		} else {
			System.out.println("Режим администрирования аппарата");
			if (banc.work) {
				System.out.println("Банкомат находится в обычном режиме");
			} else {
				System.out.println("Банкомат находится в режиме обслуживания");
			}
			System.out.println("Сменить режим работы банкомата?");
			System.out.println("y/n");
			String s = scan.nextLine();
			if (banc.bUser.equals("Admin")) {
				if (s.equals("y")) {
					banc.work = !banc.work;
					return banc;
				} else if (s.equals("n")) {
					return banc;
				}
			}
		}
		return null;
	}
}

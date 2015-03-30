package com.lapa.test1;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class TestPackage {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1;
		s1 = "s";
		String s2 = "exit";
		boolean d = (5 != 5);
		System.out.println(d);
		/*
		 * while ( !s1.equals(s2)) { s1 = s.nextLine(); System.out.println(s1);
		 * } System.out.println("alles");
		 */
		/*
		 * while (!d) { if (s1.equals(s2)) { break; } s1 = s.nextLine(); }
		 */
		/*System.out.println("Введи количество приветов");
		s1 = s.nextLine();
		for (int i = 0; i < Integer.valueOf(s1); i++) {
			System.out.println("привет");
		}*/
		for (int i=0; i<=10;i++)
		{
			if (i%2 != 0)
			{
				System.out.println(i+"-нечетное");
				continue;
			}
			else
			System.out.println(i+"-четное");
		}
	}

}

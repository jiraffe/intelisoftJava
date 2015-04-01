package com.lapa.home1;

import java.util.Scanner;

public class hometest1 {

	public static void main(String[] args) {
		double a;
		double b;
		double r;
		double a1;
		double b1;
		Scanner scs = new Scanner(System.in);
		System.out.print("Координата Х точки центра окружности = ");
		a = Double.valueOf(scs.nextLine());
		System.out.print("Координата Y точки центра окружности = ");
		b = Double.valueOf(scs.nextLine());
		System.out.print("Радиус окружности = ");
		r = Double.valueOf(scs.nextLine());
		System.out.print("Координата Х проверяемой точки = ");
		a1 = Double.valueOf(scs.nextLine());
		System.out.print("Координата Y проверяемой точки = ");
		b1 = Double.valueOf(scs.nextLine());
		if ((Math.pow((a1 - a), 2) + Math.pow((b1 - b), 2)) <= (Math.pow(r, 2)))
			System.out.println("YES");
		else
			System.out.println("no");

	}

}

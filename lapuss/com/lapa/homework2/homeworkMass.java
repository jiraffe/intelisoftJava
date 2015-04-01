package com.lapa.homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class homeworkMass {

	public static void main(String[] args) {
		boolean a = true;
		Scanner scan = new Scanner(System.in);
		ArrayList arr = new ArrayList<String>();
		while (a) {
			System.out.println("Вы в начальном меню для справки наберите help");
			String menu = scan.nextLine();

			if (menu.equals("help")) {
				System.out.println("madd - добавить данные в массив");
				System.out
						.println("mid -  просмотр элементов массива по индексу");
				System.out
						.println("midsv - замена элементов в массиве по индексу ");
				System.out
						.println("middel - удалить элемент массива по индексу");
				System.out.println("mshow - вывод массива в консоль");
				System.out.println("menu - выход в меню");
				System.out.println("exit - выход");
				continue;
			}

			if (menu.equals("madd")) {
				madd(arr, a);

			} else if (menu.equals("mid")) {
				mid(arr, a);

			} else if (menu.equals("midsv")) {
				midsv(arr, a);

			} else if (menu.equals("middel")) {
				middel(arr, a);

			} else if (menu.equals("mshow")) {
				mshow(arr);

			} else if (menu.equals("exit")) {
				a = false;
			} else {
				System.out
						.println("Введи команду не понимаю я что там введено");

			}
		}
	}

	public static void madd(ArrayList arr, boolean a) {
		System.out.println("Находимся в меню наполнения массива");
		Scanner scan = new Scanner(System.in);
		String menu;

		boolean b = true;
		while (b) {
			System.out.print("Добавляем " + (arr.size() + 1)
					+ " элемент массива");
			menu = scan.nextLine();
			if (menu.equals("menu")) {
				b = false;
			} else if (menu.equals("exit")) {

				a = false;
				b = false;
			} else {
				arr.add(menu);
			}
		}
		return;
	}

	public static void mid(ArrayList arr, boolean a) {

		System.out
				.println("Находимся в меню просмотра элементов массива по ID");
		System.out.println("Всего в массиве - " + arr.size() + " элементов");
		Scanner scan = new Scanner(System.in);

		boolean b = true;
		while (b) {
			System.out.println("Выберите любой из них:");
			String s = scan.nextLine();
			if (s.equals("menu")) {
				b = false;
			} else if (s.equals("exit")) {
				a = false;
				b = false;
			} else {
				int v = Integer.valueOf(s);
				System.out.println(v + " элемент массива =" + arr.get(v - 1));
			}

		}

		return;
	}

	public static void midsv(ArrayList arr, boolean a) {

		System.out.println("Находимся в меню замены элементов массива по ID");
		Scanner scan = new Scanner(System.in);

		boolean b = true;
		while (b) {
			System.out
					.println("Всего в массиве - " + arr.size() + " элементов");
			System.out.println("Замените любой из них:");
			String s = scan.nextLine();
			if (s.equals("menu")) {
				b = false;
			} else if (s.equals("exit")) {
				a = false;
				b = false;
			} else {
				int v = Integer.valueOf(s);
				System.out.print("меняем" + v + "элемент массива на=");
				String vs = scan.nextLine();
				arr.set((v - 1), vs);
			}

		}

		return;
	}

	public static void middel(ArrayList arr, boolean a) {

		System.out.println("Находимся в меню удаления элементов массива по ID");
		Scanner scan = new Scanner(System.in);

		boolean b = true;
		while (b) {
			System.out
					.println("Всего в массиве - " + arr.size() + " элементов");
			System.out.println("Удаляем любой из них:");
			String s = scan.nextLine();
			if (s.equals("menu")) {
				b = false;
			} else if (s.equals("exit")) {
				a = false;
				b = false;
			} else {
				int v = Integer.valueOf(s);
				System.out.print("удаляем - " + v + " элемент массива");
				arr.remove(v - 1);
			}

		}

		return;
	}

	public static void mshow(ArrayList arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		return;
	}
}

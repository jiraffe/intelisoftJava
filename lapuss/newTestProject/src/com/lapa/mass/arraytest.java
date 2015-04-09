package com.lapa.mass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class arraytest {

	public static void main(String[] args) {
		int[][] a = new int[10][10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = r.nextInt(10);
				System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "    ");
				// System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("##################################################################################");
		for (int j = 0; j < 10; j++) {
			Arrays.sort(a[j]);
			for (int i = 0; i < 10; i++) {
				System.out.print("a[" + j + "][" + i + "]=" + a[j][i] + "   ");
			}
			System.out.println();
		}

	}
}

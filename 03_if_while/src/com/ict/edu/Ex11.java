package com.ict.edu;

public class Ex11 {
	public static void main(String[] args) {
	// 3중 for문
		for (int i = 1; i < 10; i = i + 3) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + 3; k++) {
					if (i == 1 && j == 1) continue;
					System.out.print(k + " X " + j + " = " + (j*k) + "	");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
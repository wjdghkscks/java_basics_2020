package com.ict.edu;

public class Ex06 {
	public static void main(String[] args) {
		
	// 다중 for문 : for문 안에 다른 for문이 존재하는 것
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i= " + i + ", j= " + j);
			}
		}
		
		System.out.println();
		
	// 구구단 2단부터 9단까지
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
		System.out.println();

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " X " + j + " = " + (i * j) + "\t");
			}											// \t = tab
			System.out.println();
		}
		
		System.out.println();

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " X " + i + " = " + (j * i) + "	");
			}
			System.out.println();
		}
		
		System.out.println();
		
	// 0 0 0 0
	// 0 0 0 0
	// 0 0 0 0
	// 0 0 0 0 만들기

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	// 1 0 0 0
	// 0 1 0 0
	// 0 0 1 0
	// 0 0 0 1 만들기
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
		
	}
}

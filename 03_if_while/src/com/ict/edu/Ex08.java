package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {

	// 중첩 while문: while문 안에 while문을 사용
	//				다중 for문과 같음
	
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		
		System.out.println("=================");
		
		int k1 = 1;
		while (k1 < 4) {
			
			int g1 = 1;
			while (g1 < 6) {
				System.out.println("k1 = " + k1 + ", g1 = " + g1);
				g1++;
			}
			
			k1++;
		}
		
		System.out.println("=================");
		
	// 구구단 2단부터 9단까지 (나머지 2가지 나열 방법은 숙제!)
		
		int k2 = 2;
		while (k2 < 10) {			
			System.out.println(k2 + "단");
			
			int g2 = 1;
			while (g2 < 10) {
				System.out.println(k2 + " X " + g2 + " = " + (k2 * g2));
				g2++;
			}
			
			k2++;
		}
	}
}

package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
	
	// while 문: for문과 같은 반복문
	// 형식1: 초기식
	//  	  while(조건식) {
	//				조건식이 참일 때 실행 문장;
	//				증감식;
	//			}
	//
	// while문 끝을 만나면 무조건 조건식으로 이동
	//
	//	형식2: 초기식
	//  	   while(true) {
	//				if(빠져나갈 조건) break;
	//				조건식이 참일 때 실행 문장;
	//				증감식;
	//			}
	//
	// while문 끝을 만나면 무조건 조건식으로 이동
	//

	// 0 ~ 10 까지 출력
		
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int k1 = 0;
		while (k1 < 11) {
			System.out.print(k1 + " ");
			k1++;
		}
		
		System.out.println();
		
		int k2 = 0;
		while (true) {
			if(k2 > 10) break;
			System.out.print(k2 + " ");
			k2++;
		}
		System.out.println();
		
		System.out.println();
		
	// 0 ~ 10 까지 짝수만 출력
		int k3 = 0;
		while (k3 < 11) {
			if (k3 % 2 == 0) {
				System.out.print(k3 + " ");
			}
			k3++;
		}
		System.out.println();
		
		System.out.println();
		
		k3 = 0;
		while (true) {
			if (k3 >= 11) break;
			if (k3 % 2 == 0) {
				System.out.print(k3 + " ");
			}
			k3++;
		}
		
		System.out.println();
		System.out.println();
		
	// 0 ~ 10 까지 홀수만 출력 
		int k4 = 0;
		while (k4 < 11) {
			if (k4 % 2 == 1) {
				System.out.print(k4 + " ");
			}
			k4++;
		}
		System.out.println();
		
		System.out.println();
		
	// 0 ~ 50 까지 7의 배수만 출력
		int k5 = 0;
		while (k5 < 51) {
			if (k5 % 7 == 0) {
				System.out.print(k5 + " ");
			}
			k5++;
		}		
		System.out.println();
		
		System.out.println();
		
	// a ~ g 까지 출력
		char k6 = 'a';
		while (k6 < 'h') {
			System.out.print(k6 + " ");
			k6++;
		}
		System.out.println();	
		
		System.out.println();		
		
	// 구구단 5단 출력
		int k7 = 1;
		while (k7 < 10) {
			System.out.println("5 X " + k7 + " = " + (5 * k7));
			k7++;
		}
		
		System.out.println();
				
	// 0 0 0 0
	// 0 0 0 0
	// 0 0 0 0
	// 0 0 0 0 만들기
		int k8 = 1;
		int k9 = 1;
		while (k8 < 5) {
			k9 = 1;
			while (k9 < 5) {
				System.out.print(0 + " ");
				k9++;
			}
		System.out.println();
		k8++;
		}
		
		System.out.println();
		
		int k10 = 1;
		while (k10 < 17) {
			System.out.print("0 ");
			if (k10 % 4 == 0) {
				System.out.println();
			}
			k10++;
		}
		
		System.out.println();
		
		System.out.println("=================================");
		
		System.out.println();
		
	// 0 ~ 10 누적합
		int g1 = 0;
		int sum = 0;
		while (g1 <11) {
			sum = sum + g1;
			g1++;
		}
		System.out.println("합계 : " + sum);
		
	// 0 ~ 10 홀수의 합계
		int g2 = 0;
		int odd = 0;
		while (g2 < 11) {
			if (g2 % 2 == 1) {
				odd = odd + g2;
			}
			g2++;
		}
		System.out.println("홀수의 합계 : " + odd);

	// 0 ~ 10 짝수의 합계
		int g3 = 0;
		int even = 0;
		while (g3 < 11) {
			if (g3 % 2 == 0) {
				even = even + g3;
			}
			g3++;
		}
		System.out.println("짝수의 합계 : " + even);
		
	// 0 ~ 10 홀수, 짝수의 합계
		int g4 = 0;
		even = 0;
		odd = 0;
		while (g4 < 11) {
			if (g4 % 2 == 0) {
				even = even + g4;
			} else if (g4 % 2 == 1) {
				odd = odd + g4;
			}
			g4++;
		}
		System.out.println("홀수의 합계 : " + odd);
		System.out.println("짝수의 합계 : " + even);
		
	// 7!의 값 
		int g5 = 7;
		int res = 1;
		while (g5 > 0) {
			res = res * g5;
			g5--;
		}
		System.out.println("7! = " + res);
	}
}

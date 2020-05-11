package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total = 0; 			// 전체 횟수
		int even = 0; 			// 짝수 횟수
		esc:while (true) {		// 레이블 지정을 통해 아래 while문의 무한루프 활용이 가능.
			total++;
			System.out.print("숫자 입력 : ");
			int k1 = sc.nextInt();
			String str = "";
			if (k1 % 2 == 0) {
				str = "짝수";
				even++;
			} else {
				str = "홀수";
			}
			System.out.println("결과 : " + str);
			
			// 계속 진행할 지 여부를 판단하기 위하여 다시 while문을 만듦
			while(true) {
				System.out.print("계속할까요? (1.yes 2.no) ");
				int k2 = sc.nextInt();
				if (k2 == 1) {
					continue esc;
				} else if (k2 == 2) {
					break esc;
				} else {
					System.out.print("\n잘못 입력하셨습니다.\n");
					continue;
				}				
			}
		}
		System.out.println("전체 횟수 : " + total);
		System.out.println("짝수 횟수 : " + even);
		System.out.println("홀수 횟수 : " + (total - even));
		System.out.println("수고하셨습니다.");
	}
}

package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 숫자의 홀수/짝수를 판별 및 횟수 세기
		
		int total = 0; // 전체 횟수 count
		int even = 0; // 짝수 count
		while (true) {
			total += 1;
			System.out.print("숫자 입력 : ");
			int k1 = sc.nextInt();
			String str = "";
			if (k1 % 2 == 0) {
				str = "짝수";
				even += 1;
			} else {
				str = "홀수";
			}
			System.out.println("결과 : " + str);
			System.out.print("계속할까요? (1.yes 2.no) ");
			int k2 = sc.nextInt();
			if (k2 == 2) break;
		}
		System.out.println("전체 횟수 : " + total);
		System.out.println("짝수 횟수 : " + even);
		System.out.println("홀수 횟수 : " + (total - even));		
		System.out.println("수고하셨습니다.");
	}
}

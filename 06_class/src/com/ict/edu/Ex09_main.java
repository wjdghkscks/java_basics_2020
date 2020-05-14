package com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		
	// 5명의 이름, 국어, 영어, 수학 성적을 입력받아서
	// {이름, 총점, 평균, 학점, 순위}를 구하고 정렬
			
		Scanner sc = new Scanner(System.in);
				
		Ex09[] arr = new Ex09[5];
		
		for (int i = 0; i <arr.length; i++) {
			System.out.print("이름 >>> ");
			String name2 = sc.next();
			
			Ex09 arr[i] = new Ex09();
				arr[i].setName(name);
			
			System.out.print("국어 성적 >>> ");
			int kor = sc.nextInt();
			System.out.print("영어 성적 >>> ");
			int eng = sc.nextInt();
			System.out.print("수학 성적 >>> ");
			int math = sc.nextInt();
		}
		
		
		
		
		
	}
}

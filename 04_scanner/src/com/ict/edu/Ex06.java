package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
	// 성적표
	// 이름, 국어, 수학, 영어 입력 받기
	// 총점, 평균(소수점 첫째자리까지), 학점
	// 90이상 A, 80이상 B, 70이상 C, 나머지 F
	// 계속할까요? (1.yes 2.no)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. ");
		String name = sc.next();
		System.out.print("국어 성적을 입력하세요. ");
		int kor = sc.nextInt();
		System.out.print("수학 성적을 입력하세요. ");
		int math = sc.nextInt();
		System.out.print("영어 성적을 입력하세요. ");
		int eng = sc.nextInt();
		
		int all = kor + math + eng;
		int avg = (int)(all / 3);
		String grade = "";
		if (avg >= 90) {
			grade = "A학점";
		} else if (avg >= 80) {
			grade = "B학점";
		} else if (avg >= 70) {
			grade = "C학점";
		} else {
			grade = "F학점";
		}
		
		while (true) {
			System.out.print("계속할까요? (1.yes 2.no) ");
			int k1 = sc.nextInt();
			if(k1 == 2) break;
			else continue;
		}
		
		System.out.println("----------------------");
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + all);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);		
		System.out.println("수고하셨습니다.");
		
	}
}

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

		esc:while (true) {
			// 정보 입력 받기
			System.out.print("이름을 입력하세요. >>> ");
			String name = sc.next();
			System.out.print("국어 성적을 입력하세요. >>> ");
			int kor = sc.nextInt();
			System.out.print("수학 성적을 입력하세요. >>> ");
			int math = sc.nextInt();
			System.out.print("영어 성적을 입력하세요. >>> ");
			int eng = sc.nextInt();
			
			// 정보 가공하기
			int all = kor + math + eng;
			double avg = (int)(all / 3.0 * 10) / 10.0;	// int 끼리만 계산하면 double로 넘어갈 수 없음. 따라서 10.0으로 표기
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

			// 정보 출력하기
			System.out.println("----------------------");
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + all);
			System.out.println("평균 : " + avg);
			System.out.println("학점 : " + grade);
			
			// 반복문
			while (true) {
				System.out.print("\n계속할까요? (1.yes 2.no) ");
				int k1 = sc.nextInt();
				if (k1 == 1) {
					System.out.println();
					continue esc;
				} else if (k1 == 2) {
					break esc;
				} else {
					System.out.print("\n잘못 입력하셨습니다.\n");
					continue;
				}
			}
		}
		System.out.println("수고하셨습니다.");
	}
}

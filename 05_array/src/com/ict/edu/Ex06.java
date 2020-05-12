package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
	// Scanner 클래스 추가 및 import
		Scanner sc = new Scanner(System.in);
		
	// 초기값 설정
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] grade = new String[5];
		int[] rank = {1, 1, 1, 1, 1};
		
	// 이름 및 성적 입력
		for (int i = 0; i < math.length; i++) {
			System.out.print("이름을 입력하세요. ");
			name[i] = sc.next();
			System.out.print("국어 성적을 입력하세요. ");
			kor[i] = sc.nextInt();
			System.out.print("영어 성적을 입력하세요. ");
			eng[i] = sc.nextInt();
			System.out.print("수학 성적을 입력하세요. ");
			math[i] = sc.nextInt();
			System.out.println("--------------------------------------");
		}
		
	// 총점, 평균, 학점 구하기
		for (int i = 0; i < sum.length; i++) {
			// 총점
			sum[i] = kor[i] + eng[i] + math[i];
			// 평균
			avg[i] = (int)(sum[i] / 3.0 * 10.0) /10.0;
			// 학점
			if (avg[i] >= 90) {
				grade[i] = "A 학점";
			} else if (avg[i] >= 80) {
				grade[i] = "B 학점";
			} else if (avg[i] >= 70) {
				grade[i] = "C 학점";
			} else {
				grade[i] = "F 학점";
			}
		}
		
	// 순위 구하기
			for (int i = 0; i < rank.length; i++) {
				for (int j = 0; j < rank.length; j++) {
					if (sum[i] < sum[j]) {
							rank[i]++;
					}
				}
			}
				
	// 출력하기
			System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
			System.out.println("--------------------------------------");
			for (int i = 0; i < rank.length; i++) {
				System.out.print(name[i] + "\t");
				System.out.print(sum[i] + "\t");
				System.out.print(avg[i] + "\t");
				System.out.print(grade[i] + "\t");
				System.out.println(rank[i]);
			}
		
	}
}

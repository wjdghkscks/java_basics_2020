package com.ict.edu;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {		// 생성자를 이용하여 값을 넣는 방법

		Scanner sc = new Scanner(System.in);

		Ex12[] arr = new Ex12[5];

		for (int i = 0; i < arr.length; i++) {

			// 정보 입력 받기
			System.out.print("이름 >>> ");
			String name = sc.next();
			System.out.print("국어 성적 >>> ");
			int kor = sc.nextInt();
			System.out.print("영어 성적 >>> ");
			int eng = sc.nextInt();
			System.out.print("수학 성적 >>> ");
			int math = sc.nextInt();

			// 합계
			int sum = kor + eng + math;
			// 평균
			double avg = (int)(sum / 3.0 * 10) * 10.0;
			// 학점
			String hak = "";
			if (avg >= 90) {
				hak = "A 학점";
			} else if (avg >= 80) {
				hak = "B 학점";
			} else if (avg >= 70) {
				hak = "C 학점";
			} else {
				hak = "F 학점";
			}

			Ex12 person = new Ex12(name, sum, avg, hak, 1);
			
			arr[i] = person;

			System.out.println("-------------------------------------");

		}

		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}

		// 정렬하기
			Ex12 tmp = new Ex12(); // 순위 정렬을 위한 임시 클래스
	
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i].getRank() > arr[j].getRank()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}

		// 출력하기
		System.out.println("-------------------------------------");
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		System.out.println("-------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.print(arr[i].getRank() + "\t");
			System.out.println();
		}

	}
}

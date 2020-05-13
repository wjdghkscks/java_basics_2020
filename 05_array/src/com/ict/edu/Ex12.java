package com.ict.edu;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[5][5];

		// 학생 정보 입력 받기
		// 학생번호 / 총점 / 평균 / 학점 / 순위 출력하기

		// 학생번호 및 과목별 점수 받기
		for (int i = 0; i < arr.length; i++) {
			int[] ar = new int[5];		// 현재 for문 안에서만 사용하는 배열이며, for문 이후 ar 배열이 arr 배열을 구성.
			
			ar[0] = i+1;
			System.out.print("학생 " + (i+1) + "의 국어 성적 >>> ");
			int kor = sc.nextInt();
			System.out.print("학생 " + (i+1) + "의 영어 성적 >>> ");
			int eng = sc.nextInt();
			System.out.print("학생 " + (i+1) + "의 수학 성적 >>> ");
			int math = sc.nextInt();
			System.out.println("-------------------------------------");

			// 총점 저장하기
			ar[1] = kor + eng + math;

			// 평균 저장하기
			ar[2] = ar[1] / 3;

			// 학점 저장하기
			if (ar[2] >= 90) {
				ar[3] = 'A';
			} else if (ar[2] >= 80) {
				ar[3] = 'B';
			} else if (ar[2] >= 70) {
				ar[3] = 'C';
			} else {
				ar[3] = 'F';
			}

			// 순위 초기값 저장하기
			ar[4] = 1;
			
			arr[i] = ar;
		}
		
		// 순위 구하기
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(arr[i][1] < arr[j][1] ) {
						arr[i][4]++;
					}
				}
			}
			
		// 정렬하기
			
			int[] tmp = new int[5];
			
			for (int i = 0; i < (arr.length - 1); i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i][4] > arr[j][4]) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		
		// 출력하기
		
		System.out.println("번 호\t총 점\t평 균\t학 점\t순 위");
		System.out.println("-------------------------------------");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) {
					System.out.print((char)(arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}
}

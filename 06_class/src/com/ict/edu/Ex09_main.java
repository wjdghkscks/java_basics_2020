package com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		
	// 5명의 이름, 국어, 영어, 수학 성적을 입력받아서
	// {이름, 총점, 평균, 학점, 순위}를 구하고 정렬
	
		
		// 정보 입력 받기
		Scanner sc = new Scanner(System.in);
		
		Ex09[] arr = new Ex09[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print("이름 >>> ");
			String n = sc.next();			
			System.out.print("국어 성적 >>> ");
			int k = sc.nextInt();
			System.out.print("영어 성적 >>> ");
			int e = sc.nextInt();
			System.out.print("수학 성적 >>> ");
			int m = sc.nextInt();
			
			arr[i].setName(n);
			arr[i].s_sum(k, e, m);
			arr[i].s_avg();
			arr[i].s_hak();
			
		}
		
		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum() ) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		
		
		// 정렬하기
		
		Ex09 tmp = new Ex09();
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		// 출력하기
		
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		System.out.println("-------------------------------------");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t" + arr[i].getSum() + "\t" + arr[i].getAvg() + "\t" + arr[i].getHak() + "\t" + arr[i].getRank());
			System.out.println();
		}
		
			
			
			
			
		
		
		
	}
}

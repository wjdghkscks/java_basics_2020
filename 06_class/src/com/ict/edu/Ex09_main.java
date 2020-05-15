package com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		
	// 5명의 이름, 국어, 영어, 수학 성적을 입력받아서
	// {이름, 총점, 평균, 학점, 순위}를 구하고 정렬
	// 순위와 정렬은 main에서 구함
	
		
		// 정보 입력 받기
		Scanner sc = new Scanner(System.in);
		
		// 한사람의 정보를 가지고 있는 클래스가 Ex09
		// 5명의 정보를 가질 수 있는 클래스의 배열을 만들어야 함
		Ex09[] arr = new Ex09[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			Ex09 person = new Ex09();			// for문 안에서 사용할 클래스
			
			System.out.print("이름 >>> ");
		
			person.setName(sc.next());
			// String name = sc.next();			>> 2줄을 하나로
			// person.setName(name);			   축약할 수 있음
			
			System.out.print("국어 성적 >>> ");
			int kor = sc.nextInt();
			System.out.print("영어 성적 >>> ");
			int eng = sc.nextInt();
			System.out.print("수학 성적 >>> ");
			int math = sc.nextInt();
			
			// 합계
			person.s_sum(kor, eng, math);		// '메소드 흡수'를 사용하면
			// 평균								   하나만 시켜도 유기성있게 값을 도출
			person.s_avg();						// (Ex09 Line 51, 57)
			// 학점
			person.s_hak();
			
			arr[i] = person;
			
			System.out.println("-------------------------------------");
			
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
		Ex09 tmp = new Ex09();					// 순위 정렬을 위한 임시 메소드
		
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

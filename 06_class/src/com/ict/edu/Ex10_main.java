package com.ict.edu;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {	// setter를 이용하여 값을 넣는 방법
	
	Scanner sc = new Scanner(System.in);
	
	Ex10[] arr = new Ex10[5];
	
	for (int i = 0; i < arr.length; i++) {
		
		Ex10 person = new Ex10();				// for문 안에서 사용할 클래스
		
		System.out.print("이름 >>> ");
		person.setName(sc.next());
		System.out.print("국어 성적 >>> ");
		int kor = sc.nextInt();
		System.out.print("영어 성적 >>> ");
		int eng = sc.nextInt();
		System.out.print("수학 성적 >>> ");
		int math = sc.nextInt();

//--------------------------------------------------------------------------------------
// s_sum, s_avg, s_hak 이 반환형이기 때문에 처리와 저장을 같이 해주어야 함
		
		// 합계
		int sum = person.s_sum(kor, eng, math);
		person.setSum(sum);
		// 평균
		double avg = person.s_avg();
		person.setAvg(avg);
		// 학점
		String hak = person.s_hak();
		person.setHak(hak);
		
// 이러한 방식은 처리와 저장을 별도로 할 때 많이 사용	
//--------------------------------------------------------------------------------------
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
	Ex10 tmp = new Ex10();					// 순위 정렬을 위한 임시 클래스
	
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

package com.ict.edu;

import java.util.Scanner;

// [finally]
//	- 예외 처리와 상관없이 반드시 실행해야 하는 문장을 처리할 때 사용
//	- DB, I/O, 네트워크 등에서 자주 사용
//	
//	try {
//		예외가 발생할 수 있는 문장들;
//		예외가 발생할 수 있는 문장들;
//		예외가 발생할 수 있는 문장들;
//	} catch(예외 객체 e) {
//		예외 객체 처리 문장;
//	} finally {
//		무조건 실행하야 하는 문장;
//	}

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int var = 50;
			System.out.print("정수 입력: ");
			int su = sc.nextInt();
			System.out.println("정답: " + (var / su));
			
		} catch (Exception e) {
			System.out.println("제대로 입력하세요.");
			return;					// return; 을 통해 자신을 호출한 곳으로 돌아감
		} finally {					// return; 이 있어도 finally는 반드시 수행
			System.out.println("반드시 수행하는 문장");
		}
		System.out.println("\n수고하셨습니다.");
		
	}
}

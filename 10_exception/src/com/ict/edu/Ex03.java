package com.ict.edu;

import java.util.InputMismatchException;				// 오류 코드 import
import java.util.Scanner;

// 다중 catch문
//	- try문 안에 여러가지 예외가 발생할 수 있는 경우
//	- "exception" 단독 사용 시(Exception e) 반드시 아래쪽 catch 문에 사용

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 예외1 : 문자 입력	>>> InputMismatchException
		// 예외2 : 0 입력		>>> ArithmeticException
		
		/*
		try {
			
			int var = 50;
			System.out.print("정수 입력: ");
			int su = sc.nextInt();
			System.out.println("정답: " + (var / su));
			
		} catch (InputMismatchException e1) {			// import
			System.out.println("정수만 입력할 수 있습니다.");
			System.out.println("처음부터 다시 시도하세요.");
		} catch (ArithmeticException e2) {
			System.out.println("0으로는 나눌 수 없습니다.");
			System.out.println("처음부터 다시 시도하세요.");
		} catch (Exception e) {
			System.out.println("오류 발생. 처음부터 다시 시도하세요.");
		}
		System.out.println("\n수고하셨습니다.");
		*/
		
		try {
			int var = 50;
			System.out.print("정수 입력: ");
			int su = sc.nextInt();
			System.out.println("정답: " + (var / su));
			
		} catch (Exception e) {
			System.out.println("제대로 입력하세요.");
		}
		System.out.println("\n수고하셨습니다.");
	}
}

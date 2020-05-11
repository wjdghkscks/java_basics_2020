package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
	// java.lang 패키지 안에 존재하는 클래스는 아무런 제약 없이 사용 가능
	// 다른 곳에 존재하는 클래스는 반드시 import를 해야 오류가 발생하지 않음
	// import 방법 : 해당 클래스 글자 뒤에서 ctrl + space bar 또는 ctrl + shift + o
		
	// Scanner 클래스: 키보드에서 정보를 입력 받아 처리하는 클래스
	// sc에 char 처리는 없으며, String에서 char 처리하는 방법을 사용해야 함 
	
		Scanner sc = new Scanner(System.in);
		
	// 입력한 내용이 String일 경우 처리하는 방법
		
		System.out.print("당신의 이름 : ");
		String name = sc.next();
		System.out.println("입력한 이름 : " + name);
		
	// 입력한 내용을 숫자(정수)로 처리하는 방법
		
		System.out.print("당신의 나이 : ");
		int age = sc.nextInt();
		System.out.println("입력한 나이 : " + age);
		
	// 입력한 내용을 숫자(실수)로 처리하는 방법
		
		System.out.print("당신의 키 : ");
		double height = sc.nextDouble();
		System.out.println("입력한 키 : " + height);
		
	// 입력한 내용을 boolean으로 처리하는 방법
		
		System.out.print("당신은 남성입니까?(true/false) : ");
		boolean gender = sc.nextBoolean();
		if (gender) {
			System.out.println("당신은 남성입니다.");
		} else {
			System.out.println("당신은 여성입니다.");
		}
		
	}
}

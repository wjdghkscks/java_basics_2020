package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		
		try {
			
			String year = "1994";
			int age = 2020 - Integer.parseInt(year);	// String을 int로 변환
			System.out.println("나이: " + age);
			
			System.out.println("======================");
			
			String year2 = "1994년";
			int age2 = 2020 - Integer.parseInt(year2);
			System.out.println("나이: " + age2);
			
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요.");
		}
		System.out.println();
		System.out.println("수고하셨습니다.");
	}
}

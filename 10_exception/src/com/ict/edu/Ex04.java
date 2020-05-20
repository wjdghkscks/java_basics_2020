package com.ict.edu;

import java.util.Scanner;

// [throws] 예외 전가, 예외 양도
//	- 예외 발생 시 예외 처리를 하지 않고 자신을 호출한 곳으로 예외 객체를 전달
//	- 나중에라도 예외 처리(try ~ catch ~)를 해야 함

public class Ex04 {
									// 예외 전가
	public void setData(String msg) throws NumberFormatException {
		if (msg.length() >= 1) {				// .length 는 string의 길이
			String str = msg.substring(0, 1);	// .substring(0, 1)은 msg의 첫째자리 데이터를 str에 저장
			prnData(str);						// prnData 메소드 호출
		}
	}
									// 예외 전가
	public void prnData(String str) throws NumberFormatException {
		int dan = Integer.parseInt(str);
		System.out.println(dan + "단");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}

	public static void main(String[] args) {
		// main 메소드에서 결국 'try ~ catch ~' 처리
		try {
			Ex04 test = new Ex04();					// 자기자신을 객체로 생성
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력: ");
			String msg = sc.next();					// String으로 선언하여, 숫자가 들어와도 문자로 처리
			test.setData(msg);
			
		} catch (Exception e) {
			System.out.println("제대로 입력하세요.");
		}
		
	}
}

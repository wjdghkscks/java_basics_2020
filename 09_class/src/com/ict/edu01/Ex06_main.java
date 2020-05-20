package com.ict.edu01;

public class Ex06_main {
	public static void main(String[] args) {
		
	// 내부 클래스가 별도로 객체를 생성할 수 없음
		// In_01 in01 = new In_01();
		
		Ex06 e6 = new Ex06();			// 외부 클래스 객체 생성
		
		System.out.println(e6.name);
		e6.sound();
		
	// Member 내부 클래스를 만드는 방법으로는 객체 생성 불가
		// Ex06.In01 in01 = e6.new In_01();

	// [Local 내부 클래스의 객체 생성 방법]		
		// 1. 내부 클래스가 존재하는 메소드를 실행
			e6.play();
			System.out.println("외부 메소드 끝: main");
		// 2. 내부 클래스와 외부 메소드 사이에 객체를 생성 (Ex06 Line 32)
		
	}
}

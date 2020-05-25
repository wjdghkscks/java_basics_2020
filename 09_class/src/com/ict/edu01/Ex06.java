package com.ict.edu01;

// [Local 내부 클래스]
public class Ex06 {
	
	String name = "둘리";
	
	public Ex06() {
		System.out.println("외부: " + this);
	}
	
	public void sound() {
		System.out.println("호이~ 호이~");
	}
	
	public void play() {		// 외부 메소드 play() 시작
		int age = 24;

		// Local 내부 클래스
		class In_01 {			// public을 붙이면 오류 발생
			int money = 2000;
			public In_01() {
				System.out.println("내부: " + this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(money);
			}
		}	// 내부 클래스 In_01 끝
		
		In_01 in01 = new In_01();		// 객체 생성
		in01.hobby();
		System.out.println("================");
		System.out.println("외부 메소드 끝: 메소드 안");
		
	}	// 외부 메소드 play() 끝
	
}	// 외부 클래스 Ex06 끝

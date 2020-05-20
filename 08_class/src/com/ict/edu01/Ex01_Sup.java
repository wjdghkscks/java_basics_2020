package com.ict.edu01;

// 부모 클래스
public class Ex01_Sup {

	String name = "홍길동";
	int age = 57;
	String addr = "서울";
	private String dog = "댕댕이";
	static int car = 1;
	static final boolean GENDER = true;		// 상수는 대문자로만 작성
	
	public Ex01_Sup() {
		System.out.println("부모 클래스 생성자 : " + this);
	}
	
	public void prn1() {
		System.out.println("부모 클래스 메소드");
	}
	
	public static void prn2() {
		System.out.println("부모 클래스의 static 메소드");
	}
	
}

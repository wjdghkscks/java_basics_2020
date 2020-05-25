package com.ict.edu01;

// enum (열거형)
//	- 상수를 하나의 객체로 인식하며, 여러 개의 상수 객체들을 한 곳에 모아둔 하나의 객체
public class Ex01 {
	
	// static final 데이터
	static final int JAVA = 200;
	static final int HTML = 1000;
	
	// enum 안에 있는 static final들은 하나의 객체로 인식
	public enum Lesson{
		JAVA, JSP, SPRING, ANDROID, HTML
		// , 200		>> 데이터 값이므로 오류가 발생
	}
	
	public static void main(String[] args) {
		
		// enum 에서 하나를 추출						>>> 반환형은 '열거형_이름'
		Lesson s1 = Lesson.JAVA;
		
		System.out.println("s1 : " + s1);				// 객체
		System.out.println("JAVA : " + Ex01.JAVA);		// 데이터
		
		System.out.println("===================");
		
		System.out.println("HTML : " + Ex01.HTML);		// 데이터 1000
		System.out.println("HTML : " + Lesson.HTML);	// 객체
		
		System.out.println("===================");
		
		
		// enum 의 데이터들을 추출	>>> .values() 를 사용
		Lesson[] arr = Lesson.values();
		
		// .ordinal 을 통해 index 값을 추출할 수 있음
		for (Lesson k : arr) {
			System.out.println(k + ":" + k.ordinal()); 
		}
		
		
	}
	
}

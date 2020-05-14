package com.ict.edu;

public class Ex02 {

	// 멤버필드: 상태값, 데이터, 속성, 특징
	// instance 필드	: 객채를 생성할 때 같이 생성되는 필드
	//  static 필드		: 객체 생성과 상관없이 먼저 생성되는 필드
	// final 이 붙음		>>> 상수 
	// final 이 붙지않음 	>>> 변수 
	
	int kor = 80;				// instance 변수
	static int eng = 85;		// static 변수
	final int math = 90;		// instance 상수
	final static int com = 95;	// static 상수	  >>> 일반적으로 상수를 표현할 때 사용
	
	
	// 변수와 상수의 차이
	// 메소드: 작동, 기능, 동작
	// 메소드의 구성 >>> [접근제한자] [메소드종류] 반환형 메소드이름([인자]) {실행 내용}
	// void는 되돌아 갈 때 결과가 없음
	
	public void prn() {
		
	// 변수이기때문에 변경 가능
		kor = kor + 10;
		eng = eng + 10;
		
	// 상수(final)이기때문에 변경 시 오류 발생
	//	math = math + 10;
	//	com = com + 10;
		
	}
	
	
	
	
}

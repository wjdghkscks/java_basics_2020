package com.ict.edu;

public class Ex14 {
	
	// Static	: 객체 생성과 상관없이 미리 만들어지는 멤버 필드와 메소드
	// 			  클래스와 지역변수에는 사용할 수 없음
	//			  공유 개념 >>> 모든 객체가 사용할 수 있음
	//			  static 영역에 유일하게 생성됨
	
	int su = 10;			// instance 변수	
	static int num = 10;	// static 변수(클래스 변수)

	public Ex14() {
		su++;
		num ++;
	}
	
	// static은 지역변수 및 클래스와 사용 불가
	public void sum(int k1, int k2) {
		// static double p1 = 3.14;		>> static을 지역변수에 사용하니 오류 발생
		// double p1 = 3.14;
		su = k1 + k2;
	}
	
	// static 메소드
	public static void add(int k1, int k2) {
		// su = k1 + k2;				>> 전역변수 su 사용 불가
		
		num = k1 + k2;				//  >> 새로운 static 변수
		double p1 = 3.14;			//  >> static 메소드 안에서만 사용하는 지역변수
		
		// static double p2 = 3.14;		>> 지역변수에 사용 불가		
	}
	
	
}

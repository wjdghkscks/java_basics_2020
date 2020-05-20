package com.ict.edu05;

public abstract class Animal {

	// [추상 클래스]
	//	- 추상 메소드를 가지고 있는 클래스
	//	- 일반적인 멤버 필드 및 멤버 메소드도 가질 수 있음
	//	- 부모 메소드가 사용되지 않는 경우에 추상 클래스를 생성
	
	//	- 추상 메소드: body가 없는 메소드 = {실행내용} 이 없는 메소드
	//				   반드시 abstract 란 예약어를 사용	
	//					>>> 메소드는 물론 클래스에도 붙여야 함
	
	
	// 일반 멤버 필드
	int su1 = 10;					// instance 변수
	static int su2 = 20;			// static 변수
	final int SU3 = 30;				// instance 상수
	static final int SU4 = 40;		// static 상수
	
	// 일반 멤버 메소드
	public void play() {
		su1++;
		su2++;
//		SU3++;						>> 상수는 값 변경 불가
//		SU4++;						>> final은 값 변경 불가
	}
	
	public static void prn() {
		int k1 = 100;
//		static int k2 = 200;		>> 지역 변수에는 static을 사용할 수 없음
	
	// static 메소드는 전역 변수에서 static 만 사용 가능
//		System.out.println(su1);	>> 오류 발생
		System.out.println(su2);
//		System.out.println(SU3);	>> 오류 발생
		System.out.println(SU4);	
	}
	
	// 추상 메소드는 반드시 abstract 예약어를 사용해야 함
	// 반드시 클래스에도 abstract 예약어를 사용해야 함
	public abstract void like();
	
	// 추상 클래스는 static과 함께 사용할 수 없음
//	public static abstract void like();
	
	
	
	
	
}

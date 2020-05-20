package com.ict.edu08;

// [interface]
//	- 서비스를 제공하는 목록
//	- 상수 및 추상 메소드들로만 구성		>>>		생성자가 없음  →  객체 생성 불가
//	- 유일하게 다중 상속이 가능함
//	** '인터페이스가 같다' = 대체가 가능하다 = 호환이 가능하다

public interface Ex01 {
	
// 인터페이스 body 내에 생성되면 모두 static final로 처리됨
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
	// 추상 메소드가 아니라서 오류 발생
		// public void play() {}	>>> 추상 메소드엔 {} 가 없음
	
	// 일반적인 추상 메소드
	public abstract void play();
	
	// interface에서는 abstract 예약어가 없어도 오류가 발생하지 않음
	public void sound();
	
}



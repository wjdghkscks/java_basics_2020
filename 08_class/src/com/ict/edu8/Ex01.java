package com.ict.edu8;

// 인터페이스
//	- 서비스를 제공하는 목록
//	- 상수와 추상 메소드들로만 구성		>>>		생성자 X  →  객체 생성 불가
//	- 유일하게 다중 상속이 가능함
//	** '인터페이스가 같다' = 대체가 가능하다 = 호환이 가능하다

public interface Ex01 {
	
	// 인터페이스 body 내에 생성되면 모두 static final로 처리됨
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
	
	
}

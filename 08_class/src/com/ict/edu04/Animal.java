package com.ict.edu04;

public class Animal {

	// final
	//	- 종단, 끝의 의미를 가짐
	//	- final 클래스	>>> 상속 불가
	//	- final 메소드	>>> 오버라이딩 불가
	//	- final 변수	>>> 값 변경 불가 (상수)
	
	int eyes = 2;
	int legs = 4;
	
	public void like() {
		System.out.println("잠자기");
	}
	
	public void sound() {
		System.out.println("울음소리");
	}
	
	public final void sleep() {
		System.out.println("6시간만 잠을 잔다.");
	}
	
	
}

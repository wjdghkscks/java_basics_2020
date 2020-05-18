package com.ict.edu;

public class Ex01 {

	// [상속 관계]
	//	- 자식 클래스가 부모 클래스의 멤버 필드, 멤버 메소드를
	//	  객체 생성 없이 마음대로 사용할 수 있는 클래스 간의 관계
	//	- 자바에서는 다중 상속을 할 수 없음	>>> 부모 클래스가 하나만 존재
	//	- 모든 클래스는 object라는 클래스를 상속받고 있음
	//	- 형식: 자식클래스 extends 부모클래스

	public static void main(String[] args) {
		
		Ex01_Sub test = new Ex01_Sub();
		// 자식 클래스를 호출
		//		> 부모 클래스 생성 후 자식 클래스 생성
		//		> 부모-자식의 클래스 주소가 똑같음
		//		>>> 변수의 우선 순위: 지역 변수 > 전역 변수 > 부모 클래스
		
		System.out.println(test);
		
		System.out.println("======================================");
		
		test.play();	// 자식 클래스에 존재하는 play 메소드 사용 가능
		
		System.out.println("--------------------------------------");
		
		test.prn1(); 	// 부모 클래스에만 존재하는 prn1 메소드 사용 가능
		
		System.out.println("--------------------------------------");
		
		// static 은 상속과 상관없이 사용 가능
		System.out.println(Ex01_Sup.car);
		System.out.println(Ex01_Sup.GENDER);
		Ex01_Sup.prn2();
		
// 		System.out.println(test.dog);	>>> private 는 접근 불가
		
	}
	
}	

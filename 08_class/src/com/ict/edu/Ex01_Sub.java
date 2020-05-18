package com.ict.edu;

// 자식 클래스 : 자식클래스에서 부모클래스와 상속관계를 맺는다.
public class Ex01_Sub extends Ex01_Sup{
	
	String name = "홍반장";
	int age = 13;
	
	public Ex01_Sub() {
		System.out.println("자식클래스 생성자 : " + this);
	}
	
	public void play() {
		System.out.println(name); 
		
		String name = "홍두께";
		System.out.println(name);
		
		// addr은 지역 변수 X,  전역 변수 X , 부모 클래스 O
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		int age = 3;
		System.out.println(age);      	// 지역 변수 : 3
		System.out.println(this.age); 	// 전역 변수 : 13
		System.out.println(super.age);	// 부모 클래스 : 57
		}
	
	public void play2() {
// 		System.out.println(dog);		>>> 상속이어도 private는 접근 불가
		System.out.println(GENDER);
		System.out.println(car);
	}
	
}

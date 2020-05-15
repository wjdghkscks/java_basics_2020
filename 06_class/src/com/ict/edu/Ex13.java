package com.ict.edu;

public class Ex13 {
	
	// this 와 this()
	
	// this		: 객체 내부에서 객체 자신을 가리키는 예약어
	//  		  지역변수와 전역변수(멤버변수)의 이름이 같을 때
	//			  전역변수에 this를 붙여서 전역변수임을 나타냄
	
	// this()	: 객체의 생성자를 지칭하는 예약어
	//			  반드시 생성자의 첫번째 줄에 위치해야 함
	//			  생성자에서 다른 생성자를 호출할 때 사용
	//			  무한루프에 빠지지 않게 주의
	
	String name = "고길동";
	int age = 37;
	
	// 생성자
	public Ex13() { 
		// System.out.println("기본 생성자 : " + this);
		this("마이콜", 24);
	}
	
	public Ex13(String name) { 
		this.name = name;
	}
	
	public Ex13(int age) { 
		this.age = age;
	}
	
	public Ex13(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

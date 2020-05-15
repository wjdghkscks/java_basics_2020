package com.ict.edu;

public class Ex11 {

	// 생성자	: 클래스를 객체로 호출할 때 자동으로 한 번 호출됨
	// 목적		: 멤버필드(변수와 상수)의 초기화
	// 특징
	// 		- 생성자의 이름은 클래스의 이름과 같음
	//		- 생성자는 반환형이 없는 메소드와 같음
	//		- 생성자도 오버로딩이 가능 
	//				( >>> 한 클래스 안에 여러개의 생성자 존재 가능)
	//		- 생성자가 보이지 않으면 기본 생성자가 숨어있는 것임
	//				( >>> 기본 생성자: 인자가 없는 생성자 → 클래스이름() )
	//		- 만약 클래스 안에 생성자가 존재한다면, 기본 생성자는 사라짐
	//		  이 때는 클래스 안에 존재하는 생성자로 객체를 생성해야 함.
	
	// 전역변수
	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";

//------------------------------------------------------------------------------------
// 기본 생성자
//	
//	public Ex11() {
//		name = "홍길동";		// 멤버 필드의 값을 초기화&지정
//	}
//	
//
//------------------------------------------------------------------------------------
// 

	// 생성자 오버로딩
	
	public Ex11() { }									// Ex11_main t2에 사용
	
	public Ex11(String name) {							// Ex11_main t1에 사용
		this.name = name;
	}
	
	// Source > Generate Constructor using Fields
	public Ex11(String name, int age, String addr) {	// Ex11_main t3에 사용
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
//
//------------------------------------------------------------------------------------	

	// getter / setter
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	// V.O (value object) : 값을 저장하는 객체
	
	
}

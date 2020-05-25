package com.ict.edu01;

public class Ex04 {
	
// [내부 클래스]
	//	- 클래스 안에 다른 클래스가 정의되어 있는 클래스
	//	- 종류: Member, Local, static, Anonymous
	
	// 1. Member
	//	- 외부 클래스 { 멤버 필드, 생성자, 내부 클래스{ ··· }, 멤버 메소드 }
	//	- 내부 클래스는 (마치 상속처럼) 외부 클래스의 멤버들을 마음대로 사용 가능
	//	- 상속에서는 private 멤버에 접근할 수 없지만, 내부 클래스는 마음대로 접근이 가능함
	//	- 내부 클래스의 객체 생성 시, 외부 클래스를 통해서만 생성이 가능함
	//								>>> 내부 클래스가 별도로 객체를 생성할 수 없음
	
	// 2. Local
	//	- 외부 클래스 메소드 내에 내부 클래스가 존재
	//	- 외부 클래스의 지역 변수처럼 사용
	//							>>> 메소드가 실행될 때 생성 / 메소드 종료 시 삭제
	
	// 3. Static
	//	- Member 내부 클래스와 마찬가지로 외부 클래스 안에 존재
	//	- 내부 클래스의 멤버 변수는 static을 사용할 수 없지만,
	//	  어쩔 수 없이 사용하고자 할 때는 내부 클래스에도 static을 붙여서 사용
	//	- 내부 클래스 멤버는 일반 static 처럼 사용
	//	- 외부 클래스 { 멤버 필드, 생성자, static 내부 클래스{ static ··· }, 멤버 메소드 }
	
	// 4. Anonymous
	//	- 정의된 클래스의 이름이 없는 클래스
	//	- 한 번 사용한 이후에는 다시 호출할 수 없는 일회용 클래스
	
}

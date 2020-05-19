package com.ict.edu6;

public class main {
	public static void main(String[] args) {
	
	// this와 this(), super와 super()
	
	// this
	//	- 객체 내부에서 자기 자신을 지칭하는 예약어
	//	- 전역 변수와 지역 변수의 이름이 같을 때
	//	- 전역 변수 앞에 this를 붙여 전역변수를 구분함
	//
	// this(인자)
	//	- 객체의 생성자를 지칭하는 예약어
	//	- 생성자에서 다른 생성자를 호출할 때 사용
	//	- 반드시 생성자 첫 줄에 존재해야 함
	
	// super
	//	- 부모 클래스의 멤버 필드를 지칭하는 예약어
	//	- 자식 클래스의 전역 변수와 이름이 같을 때
	//	- 부모 클래스의 멤버 필드 앞에 super를 사용
	//
	// super(인자)
	//	- 부모의 생성자를 지칭하는 예약어
	//	- 부모 생성자를 호출할 때 사용
	//	- 반드시 생성자 첫 줄에 존재해야 함
	//
	//		>>> this()와 super()를 함께 사용할 수 없음
	//			this()나 super()가 표기되지 않은 경우, 기본적으로 생략된 것
		
	// 객체 생성
		Person s = new Student("홍길동 학생", 24, 25000);
		Person t = new Teacher("홍길동 강사", 30, "자바");
		Person e = new Employee("김길동 관리자", 40, "교무과");
		
	// 출력
		s.print();
		t.print();
		e.print();
		
		
	}
}

package com.ict.edu01;

class Test_A {
	
	// 일반 클래스를 인자로 하는 추상 메소드
	public void method_A(Test_B b) {
		b.method_B();
	}
	
	// 추상 클래스를 인자로 하는 추상 메소드	>>> 인터페이스도 같은 방법으로 진행
	public void method_K(Test_C c) {
		c.method_C();
	}
	
}

class Test_B {
	public void method_B() {
		System.out.println("Hello World");
	}
}

abstract class Test_C {
	abstract void method_C();
}


//////////////////////////////////////////////////////////////

public class Ex08 {
	public static void main(String[] args) {
		
	// Test_A 클래스를 이용하여, Test_B의 메소드 값을 출력
		
		Test_A test1 = new Test_A();
		Test_B test2 = new Test_B();
		test1.method_A(test2);
		
		System.out.println("=========================");
		
		Test_A test3 = new Test_A();
		test3.method_A(new Test_B());
		
		System.out.println("=========================");
		
		Test_A test4 = new Test_A();
		test4.method_K( new Test_C() {
			
			@Override									// 추상 클래스를 완성시킴
			void method_C() {
				System.out.println("환영합니다.");
			}
		} );
		
		
	}
}

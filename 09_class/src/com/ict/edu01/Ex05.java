package com.ict.edu01;

// [Member 내부 클래스 & static 내부 클래스]
public class Ex05 {

	// 멤버 필드
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;

	// 생성자
	public Ex05() {
		System.out.println("외부: " + this);
	}

	// 외부 클래스 멤버 메소드
	public void play() {
		int money = 10000;
		
		// 지역변수는 static 사용불가 
		//  int time = 120 ;
		// static final int time = 120 ;
		
		System.out.println("외부 메소드");	
	}

	// Member 내부 클래스 (+static)
	public class Inner01 {				// Member 내부클래스 Inner01 시작
		int k1 = 100;

		// 내부 클래스는 static 사용 불가
		//			 >>> 클래스에 static을 붙여야만 사용이 가능
		// static int k2 = 200;

		static final int k2 = 200;		// 상수는 관련 없이 사용 가능

		public Inner01() {
			System.out.println("내부: " + this);
		}

		public void prn() {
			System.out.println(k1);
			System.out.println(k2);
			System.out.println(Inner01.k2);

			// 외부 클래스의 멤버를 모두 사용할 수 있음
			System.out.println(name);
			System.out.println(age); 	// private도 사용 가능
			System.out.println("--------------");
			play();						// 외부 메소드
		}

	}	// Member 내부클래스 Inner01 끝
	
//--------------------------------------------------------------------------------
	
	public static class Inner02 {		// static 내부 클래스 Inner02 시작
		
		int a1 = 100;
		final int a2 = 200;
		static int a3 = 300;			// 클래스에 static을 붙여야만 사용 가능
		static final int a4 = 400;
		
		public void go() {
		// 외부 클래스의 instance 변수는 사용할 수 없음
			// System.out.println(name);
			// System.out.println(age);
			
		// 외부 클래스의 static은 가져올 수 있음
			System.out.println(gender); // static 전역 변수 
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
		}
		
		public static void go2() {
			// System.out.println(name);
			// System.out.println(age);
			// System.out.println(a1);	>> int a1 = 100;
			// System.out.println(a2);	>> final int a2 = 200;
			System.out.println(a3);
			System.out.println(a4);
		}
		
	}	// Member 내부클래스 Inner02 끝
	
}	// 외부클래스 Ex05 끝

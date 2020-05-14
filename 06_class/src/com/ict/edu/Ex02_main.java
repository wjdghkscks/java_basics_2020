package com.ict.edu;

import java.util.Random;

public class Ex02_main {
	public static void main(String[] args) {
		
	// static 과 instance
		
	// static 멤버필드 호출: 클래스이름.멤버필드
		
		System.out.println(Ex02.eng);
		System.out.println(Ex02.com);
		
		//	System.out.println(Ex02.kor);		>> static이 아니기 때문에 호출할 수 없음
		//	System.out.println(Ex02.math);		>> 객체 생성이 되지 않은 instance 필드는 호출되지 않음
		
		
	// Ex02 클래스 객체 만들기
	// 		>>> 클래스이름 참조변수 = new 생성자;
	// Ex02 에 생성자가 없으면 기본생성자로 생성
		
		Ex02 test = new Ex02();				//  >> 객체 생성
		
	// 멤버필드 호출: 객체참조변수.멤버필드
		
		System.out.println(test.kor);
		System.out.println(test.eng);
		System.out.println(test.math);
		System.out.println(test.com);
		
		System.out.println(test);
		
		System.out.println("============================");
		
	// API를 이용하여 static 메소드와 instance 메소드를 호출하기
	// API에서 제공하는 Random 클래스의 nextInt() 와 nextInt(int bound), nextDouble()를 사용하는 예시
	// nextInt()와 nextInt(int bound), nextDouble()은 static이 아니므로, 클래스를 객체로 만들어서 사용해야 함
		
	// 클래스를 객체로 만드는 방법	>>>	클래스 참조변수 = new 생성자
		
		Random ran = new Random();
		
		// nextInt() : int 범위 안에서 무작위로 정수 추출하기
		
		int res = ran.nextInt();
		System.out.println(res);
		
		System.out.println("============================");
		
		// nextInt(숫자) : 반환값이 0부터 (숫자 - 1) 사이까지
		//				   중복되는 숫자가 출력되는 경우가 많아, nextDouble()을 활용
		
		res = ran.nextInt(6);	// 0부터 5까지
		System.out.println(res);
		
		System.out.println("============================");
		
		// nextDouble() : 정해지지 않은 0.0 이상 1.0 미만의 실수
		
		double res2 = ran.nextDouble();
		System.out.println(res2);
		
		System.out.println("============================");
		
		// res2를 0 ~ 5 까지의 정수로 표현
		
		System.out.println((int)(6 * res2));	// 0부터 5까지
		
		System.out.println("============================");
		
	// API에서 제공하는 static 메소드 사용하기
		
		// Math 클래스의 메소드들은 객체 생성 없이 사용이 가능함
		// 클래스이름.멤버필드 / 클래스이름.멤버메소드
		
		System.out.println(Math.random());		// 0.0부터 1.0까지

		System.out.println("============================");
		
		// 원하는 정수까지이므로 정해지지 않은 수 지정
		
		System.out.println((int)(Math.random()*6));	// 0.0부터 5.0까지
		
		
	}
}

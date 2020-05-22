package com.ict.edu;

import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Ex03 {
	public static void main(String[] args) {
		
	// 이클립스에서 API 호출 : (해당 클래스에 커서) + shift + f2
	// 랜덤: Math.random(), Random 클래스
	//	1. Random 클래스
	//	- 각종 자료형을 난수로 발생: 자료형 범위 안에서 난수 발생
	
		Random ran = new Random();		// import 필요
		
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int형 : " + ran.nextInt());
		System.out.println("long형 : " + ran.nextLong());
		
		// float과 double은 0.0이상  1.0 미만 사이에서 난수 발생
		System.out.println("float형 : " + ran.nextFloat());
		System.out.println("double형 : " + ran.nextDouble());
		
		System.out.println("==============================");
		
		// 특정 범위를 지정하는 방법
		//	- nextInt(범위) : 0 ~ 범위 전까지 정수에서 난수 발생
		System.out.println("범위지정 : " + ran.nextInt(5));
		
		//	- nextDouble() * (범위) : 0 ~ 범위 전까지
		System.out.println("범위지정 : " + (int)(ran.nextDouble()*5));
		
		
	// 2. Math.random() : 전체 메소드가 static이므로, 객체 생성 없이 호출 가능
		
		//	random()
		System.out.println(Math.random()); 		// 0.0 이상 1.0 미만
		
		// 특정 범위를 지정하는 방법
		//	- (int)(Math.random() * (범위)) : 0 ~ 범위 전까지
		System.out.println((int)(Math.random()*6));
		
		System.out.println("==============================");
		
		
	// abs : 절대값 추출
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));
		
		System.out.println("==============================");
		
		
	// ceil(double x) : 올림
	// round(double x) : 반올림
	// floor(double x) : 내림		
		System.out.println("올림 : " + Math.ceil(3.45));
		System.out.println("올림 : " + Math.ceil(3.55));
		System.out.println("반올림 : " + Math.round(3.45));
		System.out.println("반올림 : " + Math.round(3.55));
		System.out.println("버림 : " + Math.floor(3.45));
		System.out.println("버림 : " + Math.floor(3.55));
		
		System.out.println("==============================");
		
		
	// max(자료형 a, 자료형 b) : 둘 중 큰 값 출력
	// min(자료형 a, 자료형 b) : 둘 중 작은 값 출력		
		System.out.println("max : " + Math.max(45.6, 45));
		System.out.println("min : " + Math.min(45.6, 45));
		
		System.out.println("==============================");
		
		
	// pow(double a, double b) : 제곱(승)		
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(3, 2));
		
		
		
	}
}

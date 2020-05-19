package com.ict.edu4;

public class Cat extends Animal {

	String name = "나비";
	int age = 10;
	
	public void hobby() {
		System.out.println("쥐잡이 놀이");
	}
	
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹");
	}
	
	/* 부모 클래스의 sleep 메소드가 final 처리됨
	 * 따라서 자식 클래스에서 오버라이딩이 불가능하며, 가져다 쓸 수만 있음
	 * 
	 * 	public void sleep() {
	 * 		System.out.println("8시간 잠을 잔다.");
	 * 	}
	 * 
	 */
	
}

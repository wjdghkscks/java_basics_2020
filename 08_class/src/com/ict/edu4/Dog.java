package com.ict.edu4;

public class Dog extends Animal {

	String name = "댕댕이";
	int age = 3;
	
	public void hobby() {
		System.out.println("산책하기");
	}
	
	@Override				// 오버라이드를 사용했음을 명시적으로 보여주는 것
	public void sound() {
		System.out.println("멍~ 멍~");
	}
	
}

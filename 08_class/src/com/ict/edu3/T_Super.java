package com.ict.edu3;

public class T_Super {

	String name;
	int age;
	
	public T_Super() {
		System.out.println("부모 생성자");
	}

	public T_Super(String name, int age) {
//		super();			>> T_Super 는 부모 클래스를 두지 않으므로 여기서는 필요없음.
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.print("이름 : " + name + ", 나이 : " + age);
	}
	
}

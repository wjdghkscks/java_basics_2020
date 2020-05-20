package com.ict.edu03;

public class Person {

	private String name;
	private int age;
	
	// 생성자: <<create>>~Person(name: String, age: int)
	//	- 현재 멤버 필드 전체를 인자로 사용
	//	- Source > Generate Constructor using Fields > Generate
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// getter & setter
	//	- Source > Generate Getters and Setters > Select All > Generate
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
	
	// 출력을 일괄적으로 진행하기 위해 print 메소드 생성
	public void print() {
		System.out.print("이름 : " + name + " 나이 : " + age);
	}
	
	
}

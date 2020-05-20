package com.ict.edu03;

public class Student extends Person {
	
	private int id;
	
// 	public Student() { }			>> 부모 클래스에 기본 생성자는 없기 때문에 오류가 발생	
//									>> 해결방법 1) 부모 클래스에 기본 생성자 추가
//												2) super(String, int) 를 추가
//												3) 현 클래스에 있는 기본 생성자를 삭제
	
	// Source > Generate Constructor using fields > Generate
	public Student(String name, int age, int id) {
		// name과 age는 부모 클래스에서 입력한 private 전역변수로서 super(name, age) 를 통해 사용 가능
		super(name, age);
		this.id = id;
	}

	// getter & setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.print("이름 : " + super.getName());
		System.out.print(" 나이 : " + super.getAge());
		System.out.println(" 학번 : " + id);
	}
	
	
	
}

package com.ict.edu6;

public class Teacher extends Person {
	
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	// getter & setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void print() {
		// super.print();		>> 추상 클래스를 받았을 때는 삭제.
		System.out.print("이름 : " + super.getName());
		System.out.print(" 나이 : " + super.getAge());
		System.out.println(" 과목 : " + subject);
	}
	
}

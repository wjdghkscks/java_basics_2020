package com.ict.edu03;

public class Teacher extends Person {
	
	private String subject;

	public Teacher(String name, int age, String subject) {
		// name과 age는 부모 클래스에서 입력한 private 전역변수로서 super(name, age) 를 통해 사용 가능
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
	
	public void print() {
		// 부모 클래스에서 입력한 print 메소드와 같음
		super.print();
		System.out.println(" 과목 : " + subject);
	}
	
}

package com.ict.edu06;

public class Employee extends Person {
	
	private String dept;

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public void print() {
		System.out.print("이름 : " + super.getName());
		System.out.print(" 나이 : " + super.getAge());
		System.out.println(" 부서: " + dept);
	}
	
}

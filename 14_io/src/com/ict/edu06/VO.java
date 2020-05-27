package com.ict.edu06;

import java.io.Serializable;

// [직렬화]
//	- 객체를 스트림으로 파일에 저장하는 방법

// VO: 객체의 정보를 담당하는 클래스 (인터페이스 역할)
// Serializable 인터페이스를 사용하여 직렬화

// 직렬화에서 멤버를 제외시키는 방법
//	- 멤버 앞에 transient 예약어를 붙임
//	- 단, 자료형이 boolean형인 경우 false로 바뀌기 때문에 헷갈릴 수 있음

public class VO implements Serializable{
	
	private String name;
	private int age;
	transient private double weight;	// 제외
	private boolean gender;
	
	// 생성자
	public VO() {}

	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	
	// getter & setter
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

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}

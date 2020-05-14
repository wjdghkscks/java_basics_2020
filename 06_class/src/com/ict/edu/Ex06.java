package com.ict.edu;

public class Ex06 {

	// getter()	: 호출하는 입장에서 메소드를 이용하여 변수값을 추출할 때 사용
	//			  멤버 필드는 기본적으로 private 으로 생성
	
	public String name = "홍길동";
	int age = 24;
	private double weight = 70.4;
	
	public String s_name() {
		return name;
	}
	
	public int s_age() {
		return age;
	}
	
	public double s_weight() {
		return weight;
	}
	
	// setter()	: 호출하는 입장에서 메소드를 이용하여 변수값을 변경할 때 사용
	//			  값을 보낼 필요가 없으므로 void
	//			  멤버 메소드는 기본적으로 public으로 생성
	
	public void re_name(String s) {
		name = s;
	}
	
	public void re_age(int s) {
		age = s;
	}
	
	public void re_weight(double s) {
		weight = s;
	}
	
	
}

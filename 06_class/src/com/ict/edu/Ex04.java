package com.ict.edu;

public class Ex04 {
	
	int k1 = 10;
	String str = "가나다";
	
	// 인자(매개변수): 외부에서 정보를 받아서 사용
	// 메소드 이름은 같으나 자료형이 다르면 오류 발생 X		>>> 오버로딩
	
	// add() 오버로딩
	public void add() {
		k1++;		
	}
	
	public void add(int s) {
		k1 = k1 + s;
	}
	
	public void add(float s) {				
		k1 = k1 + (int)(s);
	}
	
	public void add(double s) {
		k1 = k1 + (int)(s);
	}
	
	public void add(int s1, int s2) {
		k1 = s1 + s2;
	}
	
	public void add(String s) {				// 자료형이 다르기 때문에 오류 발생 X
		str = s;
	}
	
	public void add(int s1, String s2) {
		k1 = s1;
		str = s2;
	}
	
	public void add(String s2, int s1) {	// 인자의 순서가 달라져도 오류 발생 X
		k1 = s1;
		str = s2;
	}
	
	
	public void plus(int s) {
		k1 = k1 + s;
	}
	
	public void calc(int s1, int s2) {
		k1 = s1 + s2;
	}
	
	public void s_add(String s) {
		str = s;
	}
	
}

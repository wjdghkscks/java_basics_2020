package com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		
		System.out.println(1);
		
	// Ex03 클래스를 객체로 만들기
	// EX03에 생성자가 없으면, 기본 생성자를 사용
	
		Ex03 e3 = new Ex03();		//	>> 객체 생성
		
		System.out.println(2);
		
		// 반환형이 없으므로, 받아서 저장할 것도 없음.
		
		e3.add();					//	>> Ex03에 가서 일을 하고 되돌아감
		
		System.out.println(3);
		int res = e3.mul();			// 반환값이 있으므로 변수 선언
		System.out.println(4);
		System.out.println(res);
		
	}
}

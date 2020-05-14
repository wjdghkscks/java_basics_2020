package com.ict.edu;

public class Ex06_main {
	public static void main(String[] args) {

		Ex06 e6 = new Ex06(); // 객체 생성

		// name 을 가져오는 방법

		System.out.println(e6.name);
		
		String s = e6.s_name();
		System.out.println(s);
		System.out.println();

		// age 를 가져오는 방법

		System.out.println(e6.age);
		
		int s1 = e6.s_age();
		System.out.println(s1);
		System.out.println();

		// weight 를 가져오는 방법

		// System.out.println(e6.weight); >> weight이 private 이기 때문에 바로 접근 불가
		// 									 따라서 getter 메소드를 이용하여 접근해야 함

		double s2 = e6.s_weight(); // 접근이 불가능한 것을 메소드를 이용하여 우회 접근
		System.out.println(s2);
		System.out.println();

		System.out.println("================================\n");

		// name 변경

		e6.re_name("둘리");

		System.out.println(e6.name);
		s = e6.s_name();
		System.out.println(s);
		System.out.println();

		// age 변경

		e6.re_age(5000);

		System.out.println(e6.age);
		s1 = e6.s_age();
		System.out.println(s1);
		System.out.println();

		// weight 변경

		e6.re_weight(10000);				// int 는 double에 저장할 수 있음

		s2 = e6.s_weight();
		System.out.println(s2);
		

	}
}

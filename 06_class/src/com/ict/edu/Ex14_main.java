package com.ict.edu;

public class Ex14_main {
	String name = "태권브이";
	static String addr = "제주도";				// static 변수 추가
	public static void main(String[] args) {
		
		// System.out.println(name);			>> instance 전역변수 사용 불가
		System.out.println(addr); 				// static 변수 사용 가능

		Ex14 t1 = new Ex14();
		System.out.println(t1.su);
		System.out.println(t1.num);
		System.out.println(Ex14.num);

		System.out.println("-----------------------");

		Ex14 t2 = new Ex14();
		System.out.println(t2.su);
		System.out.println(t2.num);
		System.out.println(Ex14.num);

		System.out.println("-----------------------");

		Ex14 t3 = new Ex14();
		System.out.println(t3.su);
		System.out.println(t3.num);
		System.out.println(Ex14.num);

		System.out.println("-----------------------");

		System.out.println(t1.num);				// heap 메모리 안의 su는
		System.out.println(t2.num);				// 초기화가 되었지만,
		System.out.println(t3.num);				// static 영역 안의 num은
		System.out.println(Ex14.num);			// 초기화가 되지 않았음
		
	}
}

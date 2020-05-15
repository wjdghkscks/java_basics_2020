package com.ict.edu;

public class Ex11_main {
	public static void main(String[] args) {
	
	// 객체 생성
		
		Ex11 t1 = new Ex11("둘리");
				
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getAddr());
		
		System.out.println("---------------------------------");
		
	// t1 데이터 변경
	// name 은 둘리, age 는 5000, addr 은 남극
		
		t1.setName("둘리");
		t1.setAge(5000);
		t1.setAddr("남극");
		
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getAddr());
		
		System.out.println("=================================");
	
		
	// t2 객체 생성
		
		Ex11 t2 = new Ex11();
		
		System.out.println(t2.getName());
		System.out.println(t2.getAge());
		System.out.println(t2.getAddr());
		
		System.out.println("=================================");
		
	// t3 객체 생성
		
		Ex11 t3 = new Ex11("장길산", 40, "함경도");
		System.out.println(t3.getName());
		System.out.println(t3.getAge());
		System.out.println(t3.getAddr());
		
	}
}

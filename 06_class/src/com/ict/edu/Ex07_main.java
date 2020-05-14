package com.ict.edu;

public class Ex07_main {
	public static void main(String[] args) {
		
	Ex07 t1 = new Ex07();					// t1 객체 생성 
	
	// 이름과 가격을 출력
	
	String name = t1.getName();				// getter getName() 사용
	System.out.println(name);				// name 출력
	
	int price = t1.getPrice();				// getter getPrice() 사용
	System.out.println(price);				// price 출력
	
	System.out.println();
	
	
	// 커피우유를 딸기우유로 변경해서 출력
	
	t1.setName("딸기우유");					// setter setName() 사용
	
	name = t1.getName();					// 변경값을 name에 저장
	System.out.println(name);				// name 출력
	
	
	System.out.println("===================================");
	
	
	Ex07 t2 = new Ex07();					// t2 객체 신규 생성
											// 따라서 t1과 객체가 다르므로
	name = t2.getName();					// t1에서의 setter는 적용되지 않음
	System.out.println(name);				// >>> 클래스가 같아도 객체는 달라질 수 있음
	
		
	}
}
package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		
		// 싱글 스레드
		
		// Thread.currentThread(): 현재 실행 중인 스레드
		// .getName(): 이름 호출
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("0 ======================");
		
		Ex02 test = new Ex02();
		test.play();
		
		System.out.println("1 ======================");
		
		String name = test.sound();
		System.out.println(name);
		
		
		System.out.println("2 ======================");
		
		Ex03 test2 = new Ex03();	// 객체 생성	>>> start() 가능
		
		System.out.println("1: " + Thread.currentThread().getName());
		
		test2.go();
		
		System.out.println("2: " + Thread.currentThread().getName());
		
		test2.run();
		
		System.out.println("3: " + Thread.currentThread().getName());
		
		System.out.println("3 ======================");
		
		
		
		// 멀티 스레드
		
		test2.start();		// 해당 스레드의 작업 수행시 멀티 스레드 Thread-0 생성 및 활성화
		
		System.out.println(Thread.currentThread().getName());
		
	}
}

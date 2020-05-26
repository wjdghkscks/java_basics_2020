package com.ict.edu5;

public class Ex03_main {
	public static void main(String[] args) {
		
		Ex03 test = new Ex03();						// 객체 생성
		
		Thread thread = new Thread(test, "dog");	// 스레드 생성
		thread.start();								// start() 생성
		
		Thread thread2 = new Thread(test, "cat");	// 같은 영역(Ex03) 사용
		thread2.start();							// 임계 영역 발생 >>> 동기화 필요
		
	}
}

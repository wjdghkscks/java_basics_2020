package com.ict.edu4;

// [join 메소드]
//	- 현재(메인) 스레드는 join()을 호출한 스레드가 끝날 때까지 대기 상태
//	- join()을 호출한 스레드가 끝난 후, 스레드를 다시 실행
//	- join 메소드는 try ~ catch ~ 안에 작성

public class Ex02 {
	
	public static void main(String[] args) {
		System.out.println("메인: " + Thread.currentThread().getName());
		
		Ex03 e3 = new Ex03();
		Thread thread = new Thread(e3);
		thread.start();
		
		// join 메소드 사용
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("수고하셨습니다: " + Thread.currentThread().getName());
	}
	
}

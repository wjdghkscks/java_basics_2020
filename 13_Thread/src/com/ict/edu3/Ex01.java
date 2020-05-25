package com.ict.edu3;

// 	- implements 사용
//	- Runnable 인터페이스는 추상 메소드 run()만 가지고 있음
public class Ex01 implements Runnable{
	
	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			
			System.out.println(Thread.currentThread().getName() + " 1111111111");
			
		}
			
		play();		// play() 호출	>>> for문이 끝난 후, Thread 0 이 계속 이어받아서 처리함
		
	}
	
	public void play() {
		for (int i = 0; i < 100; i++) {
			
			System.out.println(Thread.currentThread().getName() + " ##########");
			
		}
	}
}

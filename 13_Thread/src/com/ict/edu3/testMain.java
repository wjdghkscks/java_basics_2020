package com.ict.edu3;

// [Runnable 인터페이스를 구현하는 방법]
//	- 
public class testMain {
	public static void main(String[] args) {
		
		Ex01 testA = new Ex01();
		Ex02 testB = new Ex02();
		
	// testA, testB 는 Runnable 을 가지고 구현했으므로 start 메소드가 없음
	// start() >>> run() 을 거치지 않으면 스레드 처리가 될 수 없음
		
	// 따라서, start() 는 Thread 클래스가 가지고 있으므로
	// Thread 클래스를 활용하여 스레드 처리를 진행
		
		// 방법 1
		//	- Runnable을 상속 받은 객체를 Thread 생성자에 넣어서 작업
			Thread thread = new Thread(testA);	// Ex01 멀티 스레드
			thread.start();
			
			new Thread(testB).start();			// Ex02 멀티 스레드
		
		// 방법 2
		//	- 익명 내부 클래스 사용
		//	- 안드로이드에서 사용하는 방법
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					
					for (int i = 0; i < 100; i++) {
						
						System.out.println(Thread.currentThread().getName() + " 가가가가가");
						
					}
				}
			} ).start();
		
		
	}
}

package com.ict.edu5;

// [동기화]

//	- 임계영역: 멀티 스레드에서 공통으로 사용되는 영역
//	- 임계영역이 존재하면, 현재 실행중인 스레드가 다른 스레드에게 제어권을 빼앗긴다는 문제가 발생

//	- 동기화 처리: 현재 실행중인 스레드가 끝날 때까지, 다른 스레드는 접근 불가
//				   임계영역에 synchronized 예약어를 사용

public class Ex01 implements Runnable {
	
	int x;
	
	@Override
	public synchronized void run() {		// synchronized 예약어 사용
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + (x++));
		}
	}
	
}

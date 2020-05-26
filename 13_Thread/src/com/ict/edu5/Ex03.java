package com.ict.edu5;

// [동기화]
//	- 임계 영역: 멀티 스레드에서 공통으로 사용되는 영역
//	- 현재 실행중인 스레드가 다른 스레드에게 제어권을 빼앗기는 문제 발생	>>> 동기화 처리 필요
 
//	- 동기화 처리: 현재 실행중인 스레드가 끝날 때까지, 다른 스레드는 접근 불가
//				   임계 영역에 synchronized 예약어를 사용

//	- wait(): 현재 처리중인 스레드가 끝날 때까지 다른 스레드는 접근을 할 수 없는 상태 (Lock이 걸린 상태)
//			  wait()을 풀어주기 위하여 notify(), notifyAll() 등을 사용

public class Ex03 implements Runnable {
	
	int x = 1;

	@Override
	public synchronized void run() {		// 동기화 처리 synchronized
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (x++));
			
			// wait() 사용
			if (x == 11) {
				try {
					wait();			// wait() 사용
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();			// wait()을 풀어줌
			}
			
		}
	}
	
	
	
}

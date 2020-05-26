package com.ict.edu2;

// [스레드 클래스 상속을 이용한 멀티 스레드 생성 방법]
// Start() >> run()
// 상속은 하나밖에 받을 수 없으므로, Runnable 보다 사용 빈도가 낮음
public class testMain {
	public static void main(String[] args) {
		
		System.out.println("시작: " + Thread.currentThread().getName());
		
		Ex01 t1 = new Ex01();
		Ex02 t2 = new Ex02();
		Ex03 t3 = new Ex03();
		
		t1.start();
		t2.start();
		t3.start();
		
		// 멀티 스레드에 일을 나눠주고, 메인 스레드는 작업이 먼저 끝남
		// 메인 스레드가 작업이 먼저 끝나도, 멀티 스레드들은 계속 작업을 진행함
		System.out.println("끝: " + Thread.currentThread().getName());
		
	}
}

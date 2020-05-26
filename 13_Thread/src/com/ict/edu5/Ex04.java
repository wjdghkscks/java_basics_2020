package com.ict.edu5;

// 2개의 스레드를 생성하여, 첫번째 스레드의 출력을 1-100까지 출력하고
// 두번째 스레드의 출력을 101-200까지 출력하라

public class Ex04 implements Runnable {

	int x = 0;
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + (++x));
		}
	}
	
	public static void main(String[] args) {
		
		Ex04 t = new Ex04();
		
		Thread thread = new Thread(t, "1st");
		thread.start();
		
		Thread thread2 = new Thread(t, "2nd");
		thread2.start();
		
		
	}
}

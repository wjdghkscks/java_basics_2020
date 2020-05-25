package com.ict.edu4;

// [데몬 스레드]
//	- 일반 스레드의 작업을 돕는 보조 역할을 수행하는 스레드
//	- 일반 스레드가 종료하면, 데몬 스레드는 강제 종료

// Runnable
public class Ex01 implements Runnable {
	
	boolean autoSave = false;
	
	@Override
	public void run() {
		
		while (true) {
			try {
				
				Thread.sleep(1000*3);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			System.out.println("========");
		}
	}

	
// main
	public static void main(String[] args) {
		
		/*
		Ex01 e1 = new Ex01();
		Thread thread = new Thread(e1);
		*/
		
		Thread thread = new Thread(new Ex01());
		thread.setDaemon(true);						// 데몬 스레드 설정
		thread.start();
		
		for (int i = 1; i < 15; i++) {
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				
				
			}
			System.out.println(i);
		}
		
		System.out.println("~~프로그램 종료~~");
		
	}
}

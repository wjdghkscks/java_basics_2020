package com.ict.edu3;

public class Ex02 implements Runnable {
	
	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			
			System.out.println(Thread.currentThread().getName() + " aaaaaaaaaa");
			
		}
	}
}

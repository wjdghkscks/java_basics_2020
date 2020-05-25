package com.ict.edu5;

public class Ex02 implements Runnable {
	
	@Override
	public void run() {
		kitchen();
		bedroom();
	}
	
	// 동기화 X
	public void kitchen() {
		System.out.println(Thread.currentThread().getName() + " is in kitchen");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName() + " is leaving kitchen");
	}
	
	// 동기화 O
	public synchronized void bedroom() {
		System.out.println(Thread.currentThread().getName() + " is in bedroom");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName() + " is leaving bedroom");
	}
	
}

package com.ict.edu6;

// 소비자
public class Customer implements Runnable {
	
	private Car car;
	
	// 생성자에서 받은 인자를 전역 변수로 변경
	public Customer (Car car) {
		this.car = car;
	}
	
	public void run() {
		// 소비자가 산 차
		String carName = null;
		
		for (int i = 0; i < 50; i++) {
			carName = car.pop();
			
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

package com.ict.edu6;

public class Producer implements Runnable {
	
	private Car car;
	
	public Producer(Car car) {
		this.car = car;
	}
	
	public void run() {
		String carName = null;
		
		for (int i = 0; i < 50; i++) {
			
			carName = car.getCar();		// 자동차 생산
			car.push(carName);			// 생산한 차를 창고에 넣기
			
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	} 
}

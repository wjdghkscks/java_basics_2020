package com.ict.edu6;

import java.util.ArrayList;
import java.util.List;

	// 자동차 생산 공장
	public class Car {
		// 자동차 창고
		private List<String> carList = null;		// 부모
		public Car() {
			carList = new ArrayList<String>();		// 자식
		}
	
	// 랜덤으로 자동차 생산
	public String getCar() {
		String carName = null;
		
		switch ((int)(Math.random() * 3)) {
		case 0: carName = "SM5"; break;
		case 1: carName = "매그너스"; break;
		case 2: carName = "카렌스"; break;
		}
		return carName;
	}
	
	// 자동차를 사는 메소드
	public synchronized String pop() {
		String carName = null;
		// 재고가 없는 경우
		if (carList.size() == 0) {
			try {
				System.out.println("~~ 차가 없어요. 생산할 때까지 기다리세요 ~~ \n");
				wait();	// wait()
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 재고가 있는 경우	>>> 가장 나중에 들어간 차를 삭제
		carName = carList.remove(carList.size() - 1);
		System.out.println("손님이 차를 사갔습니다. 판매한 차 이름은 >>> " + carName + "\n");

		return carName;
	}
	
	// 자동차 창고에 차 넣기
	public synchronized void push(String car) {
		// 받은 차(car)를 창고(carList)에 넣기 
		carList.add(car);
		System.out.println("차가 만들어졌습니다. " + "차 이름은 " + car + "\n");
		if (carList.size() == 5) {
			notify();		// notify()
		}
		
	}
}

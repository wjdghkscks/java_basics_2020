package com.ict.edu6;

// wait(): 멈추다		>> 현재 스레드를 완전 멈춤
// notify(): 깨우다		>> 완전 멈춰있는 스레드를 활성화
// 위 2개는 반드시 동기화 영역 안에서 이뤄져야 함

public class ProducerCustomerEx {
	public static void main(String[] args) {
		
		Car c = new Car();
		
		Producer producer = new Producer(c);
		
		Thread tProducer = new Thread (producer);
		
		Customer customer = new Customer(c);
		
		Thread tCustomer = new Thread (customer);
		
		tProducer.start();
		tCustomer.start();
		
	}
}

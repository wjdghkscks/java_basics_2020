package com.ict.edu6;

public class ProducerCustomerEx {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		Producer producer = new Producer(car);
		Customer customer = new Customer(car);
		
		/*
		Thread thread_p = new Thread (producer);
		Thread thread_c = new Thread (customer);
		
		thread_p.start();
		thread_c.start();
		*/
		
		new Thread(producer).start();
		new Thread(customer).start();
		
	}
}

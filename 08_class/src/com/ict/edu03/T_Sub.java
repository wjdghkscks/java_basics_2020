package com.ict.edu03;

public class T_Sub extends T_Super {

	String addr;
	int car;
	
	public T_Sub() {
		System.out.println("자식 생성자1");
	}
	
	public T_Sub(String addr) {
		this.addr = addr;
		System.out.println("자식 생성자2");
	}

	public T_Sub(int car) {
		this.car = car;
	}
	
	public T_Sub(String addr, int car) {
		this.addr = addr;
		this.car = car;
	}
	
	public T_Sub(int car, String addr) {
		this.car = car;
		this.addr = addr;
	}
	
	
	
	
}

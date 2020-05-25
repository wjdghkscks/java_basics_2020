package com.ict.edu;

// Thread 클래스에는 start(), run() 가 존재
public class Ex03 extends Thread {		// 스레드 상속

	public void go() {
		System.out.println("go 메소드: " + currentThread().getName());
	}
	
	public void run() {
		System.out.println("run 메소드: " + currentThread().getName());
		System.out.println("run 메소드: " + currentThread().getName());
		System.out.println("run 메소드: " + currentThread().getName());
		System.out.println("run 메소드: " + currentThread().getName());
	}
	
	/*
	public void start() {
		System.out.println("start 메소드: " + currentThread().getName());
		System.out.println("start 메소드: " + currentThread().getName());
		System.out.println("start 메소드: " + currentThread().getName());
		System.out.println("start 메소드: " + currentThread().getName());
	}
	*/
}

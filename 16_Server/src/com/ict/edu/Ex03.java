package com.ict.edu;

import java.net.ServerSocket;
import java.net.Socket;

//생성자를 이용한 서버 생성
public class Ex03 implements Runnable {
	
	ServerSocket ss = null;
	
	public Ex03() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 대기 중......");
			
			// Ex03이 Runnable을 갖고 있으므로, start()를 위해 객체 생성을 따로 할 필요가 없음
			new Thread(this).start();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		
		try {
			while (true) {
				
				Socket s = ss.accept();
				System.out.println(Thread.currentThread().getName());
				System.out.println("ip: " + s.getInetAddress().getHostAddress());

			}
		} catch (Exception e) {
		}
		
	}
	
	public static void main(String[] args) {
		
		new Ex03();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
	}
}

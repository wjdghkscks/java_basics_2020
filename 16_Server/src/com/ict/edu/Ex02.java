package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


// [Server에 스레드 처리하기] - bad case
public class Ex02 implements Runnable {
	static ServerSocket ss;
	public static void main(String[] args) {
		
		try {
			
			ss = new ServerSocket(7777);
			System.out.println("서버 대기 중......");
			
			Ex02 e2 = new Ex02();
			Thread thread = new Thread(e2);		// start()를 갖고 있는 스레드 생성
			thread.start(); 					// 스레드 start();
			
		} catch (Exception e) {
		}
		
		
	}

	@Override
	public void run() {
		
		// 스레드 무한루프 생성
		while (true) {
			
			try {
				
				Socket s = ss.accept();
				
				System.out.println("ip: " + s.getInetAddress().getHostAddress());
				System.out.println("server| 수고하셨습니다.");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

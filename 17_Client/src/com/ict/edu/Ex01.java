package com.ict.edu;

import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) {
		
		Socket s = null;
		
		try {
			
			// 소켓 생성 >> Socket(InetAddress address, int port)
			s = new Socket("203.236.220.76", 7777);
			
			System.out.println("client| 수고하셨습니다.");
			
		} catch (Exception e) {
		} finally {
			try {
				s.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}

package com.ict.edu01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
[InetAddress]
- InetAddress: Java에서 IP 주소를 표현하는 클래스
- 생성자가 존재하긴 하지만, 사용하지 않음
- 따라서 생성자 대신, static 메소드를 사용
 >> LocalHost: 현재 내가 사용하고 있는 컴퓨터

*/

public class Ex01 {
	public static void main(String[] args) {
	
		try {
			
			// .getLocalHost() : 나의 주소를 가져옴
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("이름: " +  addr.getHostName());
			System.out.println("주소: " +  addr.getHostAddress());
			System.out.println("toString(): " +  addr.toString());
			System.out.println("=========================================");
			
			// .getByName("주소") : 다른 URL을 가져옴
			addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름: " +  addr.getHostName());
			System.out.println("주소: " +  addr.getHostAddress());
			System.out.println("toString(): " +  addr.toString());
			System.out.println("=========================================");
			
			// 125.209.222.141
			byte[] b = {125, (byte) 209, (byte)22, (byte) 141};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름: " +  addr.getHostName());
			System.out.println("주소: " +  addr.getHostAddress());
			System.out.println("toString(): " +  addr.toString());
			System.out.println("=========================================");
			
			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress k : addrs) {
				System.out.println("이름: " +  k.getHostName());
				System.out.println("주소: " +  k.getHostAddress());
				System.out.println("toString(): " +  k.toString());
				System.out.println("------------------------");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}

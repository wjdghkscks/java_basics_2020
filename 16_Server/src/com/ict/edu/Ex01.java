package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
[소켓]
- Java는 소켓을 통해 네트워크 통신을 함
- 소켓은 읽기/쓰기를 위한 인터페이스를 제공

- 포트: 내부와 외부를 연결하는 게이트 역할
		0 ~ 65535 까지 존재하며, 1024까지는 사용하지 않음
- 서버 >> ServerSocket / 클라이언트 >> Socket

*/
// CMD 실행 > ipconfig/all 입력 > IPv4 주소 확인
//나의 IPv4 주소 . . . . . . . . . : 203.236.220.76

public class Ex01 {
	public static void main(String[] args) {
		
		try {
			
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 대기 중......");
			
			// .accept: 클라이언트가 접속할 때까지 기다리게 만듦
			// 			클라이언트의 접속 확인 후, 담당 소켓(s)을 생성
			// 			담당 소켓(s)은 접속한 클라이언트의 정보를 가지고 있음
			Socket s = ss.accept();		// 여기서 클라이언트의 정보값을 받음
			
			// 클라이언트 정보 출력
			String ip = s.getInetAddress().getHostAddress();
			String name = s.getInetAddress().getHostName();
			
			System.out.println("ip: " + ip);
			System.out.println("name: " + name);
			System.out.println("server| 수고하셨습니다.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

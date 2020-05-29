package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
[echo Server 에코 서버] - 서버
- 받은 내용을 그대로 돌려 주는 서버
- 생성 순서: input > output
*/

public class Ex01 implements Runnable {

	ServerSocket ss = null;
	
	// 정보를 받기 위한 스트림 (바이트 스트림)
	InputStream is;
	BufferedInputStream bis;
	
	OutputStream os;
	BufferedOutputStream bos;
	
	public Ex01() {
		try {
			
			ss = new ServerSocket(7777);
			System.out.println("에코 서버 대기 중......");
			new Thread(this).start();
			
		} catch (Exception e) {
		}
	}
	
	
	
	@Override
	public void run() {
		try {
			while (true) {
				
				Socket s = ss.accept();
				
			// 클라이언트에서 온 데이터를 스트림 처리
				is = s.getInputStream();
				bis = new BufferedInputStream(is);
				
				/* while을 빠져나오지 못하는 문제 발생
				int b;
				StringBuffer sb = new StringBuffer();
				
				while ((b = bis.read()) != -1) {
					sb.append((char)(b));
				}
				*/
				
				byte[] b = new byte[1024];
				bis.read(b);
				String msg = new String(b);
				msg = msg.trim();
				// String msg = sb.toString();
				System.out.println("받은 메시지: " + msg);
				
				
			// 클라이언트에게 받은 데이터를 다시 보내기
				os = s.getOutputStream();
				bos = new BufferedOutputStream(os);
				
				bos.write(msg.getBytes());
				bos.flush();
			}
		} catch (Exception e) {
			System.out.println(e);		// 오류 발생 시 확인을 위해 추가
		}								// 서버이므로 .close(); 사용 X
		
	}
	
	
	
	public static void main(String[] args) {
		new Ex01();
	}
}

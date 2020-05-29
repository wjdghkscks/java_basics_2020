package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/*
[echo Server 에코 서버] - 클라이언트
- 받은 내용을 그대로 돌려 주는 서버
- 생성 순서: output > intput
*/

public class Ex01 implements Runnable {

	Socket s;
	
	OutputStream os;
	BufferedOutputStream bos;
	
	InputStream is;
	BufferedInputStream bis;
	
	Scanner sc = new Scanner(System.in);
	
	
	public Ex01() {
		new Thread(this).start();
	}
	
	
	
	@Override
	public void run() {
		
		try {
			while (true) {
				System.out.print("보낼 메시지를 입력하세요. ");
				String msg = sc.next();
				
				s = new Socket("203.236.220.76", 7777);
				
			// 클라이언트에게 데이터를 보내기
				os = s.getOutputStream();
				bos = new BufferedOutputStream(os);
				
				bos.write(msg.getBytes());
				bos.flush();
				
			// 클라이언트에게 다시 데이터를 받기
				is = s.getInputStream();
				bis = new BufferedInputStream(is);
				
				/*
				int b;
				StringBuffer sb = new StringBuffer();
				
				while ((b = bis.read()) != -1) {
					sb.append((char)b);				// char 로 받아서
				}
				String re_msg = sb.toString();		// String으로 변환
				*/
				
				byte[] b = new byte[1024];
				bis.read(b);
				
				String re_msg = new String(b);
				re_msg = re_msg.trim();
				System.out.println("받은 메시지: " + re_msg);
				
				if (re_msg.equalsIgnoreCase("exit")) break;
			}
			System.out.println("수고하셨습니다.");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				s.close();
				bos.close();
				os.close();
				bis.close();
				is.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Ex01();
	}
	
}

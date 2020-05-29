package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/*
[echo Server 에코 서버] - 클라이언트
- 받은 내용을 그대로 돌려 주는 서버
- 생성 순서: output > intput
*/

public class Ex02 implements Runnable {

	Socket s;
	
	OutputStream os;
	OutputStreamWriter osw;
	BufferedWriter bw;
	
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	
	Scanner sc = new Scanner(System.in);
	
	
	public Ex02() {
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		
		try {
			while (true) {
				
				System.out.print("보낼 메시지를 입력하세요. ");
				String msg = sc.next();							// sc.next() >>> 단어로 구분
																// sc.nextLine() >>> 라인으로 구분
				s = new Socket("203.236.220.76", 7777);
				
			// 클라이언트에게 데이터를 보내기
				os = s.getOutputStream();
				osw = new OutputStreamWriter(os);
				bw = new BufferedWriter(osw); 
				
				msg += System.getProperty("line.separator");	// 라인의 끝 표시 >>> 문자 스트림에서는 반드시 추가
				bw.write(msg);
				bw.flush();
				
			// 클라이언트에게 다시 데이터를 받기	
				is = s.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				
				String re_msg = br.readLine();
				System.out.println("(" + s.getLocalAddress() + ") 받은 메시지: " + re_msg);
				if (re_msg.equalsIgnoreCase("exit")) break;
				
			}
			System.out.println("수고하셨습니다.");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				osw.close();
				os.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
